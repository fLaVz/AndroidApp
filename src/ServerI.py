import Ice
import sys
import time
import mp3App
from mp3App import vlc


class ServerI(mp3App.Function):

    playList = []

    def sendPlayList(self, seq, current=None):
        self.playList = seq

    def receivePlaylist(self, current=None):
        return self.playList

    def add(self, son, current=None):
        if not self.searchByName(son.name):
            self.playList.append(son)
            print("'" + son.name + "' added to playList")

    def remove(self, name, current=None):
        for aSong in self.playList:
            if aSong.name == name:
                self.playList.remove(aSong)
                print("'" + aSong.name + "' removed from playList\n")

    def searchByName(self, name, current=None):
        for aSong in self.playList:
            if aSong.name == name:
                print("Music '" + aSong.name + "' found in playList \n")
                return True
        return False

    def searchByGenre(self, genre, current=None):
        print("Genre '" + genre + "':")
        for aSong in self.playList:
            if aSong.genre == genre:
                print("Music '" + aSong.name + "'")
        print("\n")

    def searchByArtist(self, artist, current=None):
        print("Artist '" + artist + "':")
        for aSong in self.playList:
            if aSong.artist == artist:
                print("Music '" + aSong.name + "'")
        print("\n")

    def printPlayList(self, current=None):
        print("PlayList: ")

        for aSong in self.playList:
            print(aSong.name + " || " + aSong.artist + " || " + aSong.genre + " || " + aSong.length + " || " + aSong.path)
        print("\n")

    def playMusic(self, current=None):
        player = vlc.Instance()
        options = "#transcode{acodec=mp3,ab=128,channels=2,samplerate=44100}:http{dst=:8090/player.mp3}"
        player.vlm_add_broadcast("media", "music/test.mp3", options, 0, [], True, False)
        player.vlm_play_media("media")
        time.sleep(30)
        player.vlm_stop_media("media")
        player.vlm_release()


with Ice.initialize(sys.argv) as communicator:
    adapter = communicator.createObjectAdapterWithEndpoints("Function", "default -h localhost -p 10000")
    object = ServerI()
    adapter.add(object, communicator.stringToIdentity("server"))
    adapter.activate()
    communicator.waitForShutdown()