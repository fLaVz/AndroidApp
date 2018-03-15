from flask import Flask
import json
import request

app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello World!"

@app.route("/", methods=['POST'])
def run():
    if request.form:
        an = Analyzer()
        an.analyzeAction(request.form)
        return json.dumps({'action': an.action, 'music': an.song})

class Analyzer():

    action = "default"
    song = "default"


    def analyzeAction(self, phrase):
        if "joue" in phrase:
            self.action = "joue"
        elif "play" in phrase:
            self.action = "play"
        else:
            print("Phrase cannot be analyzed")
        self.analyzeMusic(phrase)

    def analyzeMusic(self, music):
        music = music.split(self.action + " ", 1)
        self.song = music[1]

    def printSong(self):
        print(self.action)
        print(self.song)