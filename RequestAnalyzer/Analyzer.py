from flask import Flask
from flask import request
import json

app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello World!"

@app.route("/", methods=['POST'])
def process():
    if request.form:
        an = Analyzer()
        print(request.data)
        an.analyzeAction(request.form["phrase"])
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

#export FLASK_APP=Analyzer.py
#flask run
#curl --data "phrase=play Californiamdazd adz a" http://127.0.0.1:5000