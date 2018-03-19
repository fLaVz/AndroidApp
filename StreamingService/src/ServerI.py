import Ice
import sys

import mp3App
from mp3App import vlc


class ServerI(mp3App.Function):

    playList = []
    instance = vlc.Instance()
    player = instance.media_player_new()

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
        if self.player is None and self.instance is None:
            self.instance = vlc.Instance()
            self.player = self.instance.media_player_new()

        options = ':sout=#transcode{vcodec=none,acodec=mp3,ab=128,channels=2,samplerate=44100}:http{mux=mp3,dst=:8080/}'
        media = self.instance.media_new('/music/test.mp3', options)
        print("playing music")
        self.player.set_media(media)
        self.player.play()

    def stopMusic(self, current=None):
        if self.player is not None:
            print("stoping music attempt")
            self.player.release()
            self.instance = None
            self.player = None
        # time.sleep(90)
        # http://localhost:8080


with Ice.initialize(sys.argv) as communicator:
    adapter = communicator.createObjectAdapterWithEndpoints("Function", "tcp -h 127.0.0.1 -p 10000")
    object = ServerI()
    adapter.add(object, communicator.stringToIdentity("server"))
    adapter.activate()
    communicator.waitForShutdown()