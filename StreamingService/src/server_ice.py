# -*- coding: utf-8 -*-
# **********************************************************************
#
# Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
#
# This copy of Ice is licensed to you under the terms described in the
# ICE_LICENSE file included in this distribution.
#
# **********************************************************************
#
# Ice version 3.7.0
#
# <auto-generated>
#
# Generated from file `server.ice'
#
# Warning: do not edit this file.
#
# </auto-generated>
#

from sys import version_info as _version_info_
import Ice, IcePy

# Start of module mp3App
_M_mp3App = Ice.openModule('mp3App')
__name__ = 'mp3App'

if 'Song' not in _M_mp3App.__dict__:
    _M_mp3App.Song = Ice.createTempClass()
    class Song(object):
        def __init__(self, name='', artist='', genre='', length='', path=''):
            self.name = name
            self.artist = artist
            self.genre = genre
            self.length = length
            self.path = path

        def __hash__(self):
            _h = 0
            _h = 5 * _h + Ice.getHash(self.name)
            _h = 5 * _h + Ice.getHash(self.artist)
            _h = 5 * _h + Ice.getHash(self.genre)
            _h = 5 * _h + Ice.getHash(self.length)
            _h = 5 * _h + Ice.getHash(self.path)
            return _h % 0x7fffffff

        def __compare(self, other):
            if other is None:
                return 1
            elif not isinstance(other, _M_mp3App.Song):
                return NotImplemented
            else:
                if self.name is None or other.name is None:
                    if self.name != other.name:
                        return (-1 if self.name is None else 1)
                else:
                    if self.name < other.name:
                        return -1
                    elif self.name > other.name:
                        return 1
                if self.artist is None or other.artist is None:
                    if self.artist != other.artist:
                        return (-1 if self.artist is None else 1)
                else:
                    if self.artist < other.artist:
                        return -1
                    elif self.artist > other.artist:
                        return 1
                if self.genre is None or other.genre is None:
                    if self.genre != other.genre:
                        return (-1 if self.genre is None else 1)
                else:
                    if self.genre < other.genre:
                        return -1
                    elif self.genre > other.genre:
                        return 1
                if self.length is None or other.length is None:
                    if self.length != other.length:
                        return (-1 if self.length is None else 1)
                else:
                    if self.length < other.length:
                        return -1
                    elif self.length > other.length:
                        return 1
                if self.path is None or other.path is None:
                    if self.path != other.path:
                        return (-1 if self.path is None else 1)
                else:
                    if self.path < other.path:
                        return -1
                    elif self.path > other.path:
                        return 1
                return 0

        def __lt__(self, other):
            r = self.__compare(other)
            if r is NotImplemented:
                return r
            else:
                return r < 0

        def __le__(self, other):
            r = self.__compare(other)
            if r is NotImplemented:
                return r
            else:
                return r <= 0

        def __gt__(self, other):
            r = self.__compare(other)
            if r is NotImplemented:
                return r
            else:
                return r > 0

        def __ge__(self, other):
            r = self.__compare(other)
            if r is NotImplemented:
                return r
            else:
                return r >= 0

        def __eq__(self, other):
            r = self.__compare(other)
            if r is NotImplemented:
                return r
            else:
                return r == 0

        def __ne__(self, other):
            r = self.__compare(other)
            if r is NotImplemented:
                return r
            else:
                return r != 0

        def __str__(self):
            return IcePy.stringify(self, _M_mp3App._t_Song)

        __repr__ = __str__

    _M_mp3App._t_Song = IcePy.defineStruct('::mp3App::Song', Song, (), (
        ('name', (), IcePy._t_string),
        ('artist', (), IcePy._t_string),
        ('genre', (), IcePy._t_string),
        ('length', (), IcePy._t_string),
        ('path', (), IcePy._t_string)
    ))

    _M_mp3App.Song = Song
    del Song

if '_t_playList' not in _M_mp3App.__dict__:
    _M_mp3App._t_playList = IcePy.defineSequence('::mp3App::playList', (), _M_mp3App._t_Song)

_M_mp3App._t_Function = IcePy.defineValue('::mp3App::Function', Ice.Value, -1, (), False, True, None, ())

if 'FunctionPrx' not in _M_mp3App.__dict__:
    _M_mp3App.FunctionPrx = Ice.createTempClass()
    class FunctionPrx(Ice.ObjectPrx):

        def sendPlayList(self, seq, context=None):
            return _M_mp3App.Function._op_sendPlayList.invoke(self, ((seq, ), context))

        def sendPlayListAsync(self, seq, context=None):
            return _M_mp3App.Function._op_sendPlayList.invokeAsync(self, ((seq, ), context))

        def begin_sendPlayList(self, seq, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_sendPlayList.begin(self, ((seq, ), _response, _ex, _sent, context))

        def end_sendPlayList(self, _r):
            return _M_mp3App.Function._op_sendPlayList.end(self, _r)

        def add(self, son, context=None):
            return _M_mp3App.Function._op_add.invoke(self, ((son, ), context))

        def addAsync(self, son, context=None):
            return _M_mp3App.Function._op_add.invokeAsync(self, ((son, ), context))

        def begin_add(self, son, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_add.begin(self, ((son, ), _response, _ex, _sent, context))

        def end_add(self, _r):
            return _M_mp3App.Function._op_add.end(self, _r)

        def remove(self, name, context=None):
            return _M_mp3App.Function._op_remove.invoke(self, ((name, ), context))

        def removeAsync(self, name, context=None):
            return _M_mp3App.Function._op_remove.invokeAsync(self, ((name, ), context))

        def begin_remove(self, name, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_remove.begin(self, ((name, ), _response, _ex, _sent, context))

        def end_remove(self, _r):
            return _M_mp3App.Function._op_remove.end(self, _r)

        def searchByName(self, name, context=None):
            return _M_mp3App.Function._op_searchByName.invoke(self, ((name, ), context))

        def searchByNameAsync(self, name, context=None):
            return _M_mp3App.Function._op_searchByName.invokeAsync(self, ((name, ), context))

        def begin_searchByName(self, name, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_searchByName.begin(self, ((name, ), _response, _ex, _sent, context))

        def end_searchByName(self, _r):
            return _M_mp3App.Function._op_searchByName.end(self, _r)

        def searchByGenre(self, genre, context=None):
            return _M_mp3App.Function._op_searchByGenre.invoke(self, ((genre, ), context))

        def searchByGenreAsync(self, genre, context=None):
            return _M_mp3App.Function._op_searchByGenre.invokeAsync(self, ((genre, ), context))

        def begin_searchByGenre(self, genre, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_searchByGenre.begin(self, ((genre, ), _response, _ex, _sent, context))

        def end_searchByGenre(self, _r):
            return _M_mp3App.Function._op_searchByGenre.end(self, _r)

        def searchByArtist(self, name, context=None):
            return _M_mp3App.Function._op_searchByArtist.invoke(self, ((name, ), context))

        def searchByArtistAsync(self, name, context=None):
            return _M_mp3App.Function._op_searchByArtist.invokeAsync(self, ((name, ), context))

        def begin_searchByArtist(self, name, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_searchByArtist.begin(self, ((name, ), _response, _ex, _sent, context))

        def end_searchByArtist(self, _r):
            return _M_mp3App.Function._op_searchByArtist.end(self, _r)

        def printPlayList(self, context=None):
            return _M_mp3App.Function._op_printPlayList.invoke(self, ((), context))

        def printPlayListAsync(self, context=None):
            return _M_mp3App.Function._op_printPlayList.invokeAsync(self, ((), context))

        def begin_printPlayList(self, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_printPlayList.begin(self, ((), _response, _ex, _sent, context))

        def end_printPlayList(self, _r):
            return _M_mp3App.Function._op_printPlayList.end(self, _r)

        def receivePlaylist(self, context=None):
            return _M_mp3App.Function._op_receivePlaylist.invoke(self, ((), context))

        def receivePlaylistAsync(self, context=None):
            return _M_mp3App.Function._op_receivePlaylist.invokeAsync(self, ((), context))

        def begin_receivePlaylist(self, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_receivePlaylist.begin(self, ((), _response, _ex, _sent, context))

        def end_receivePlaylist(self, _r):
            return _M_mp3App.Function._op_receivePlaylist.end(self, _r)

        def playMusic(self, context=None):
            return _M_mp3App.Function._op_playMusic.invoke(self, ((), context))

        def playMusicAsync(self, context=None):
            return _M_mp3App.Function._op_playMusic.invokeAsync(self, ((), context))

        def begin_playMusic(self, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_playMusic.begin(self, ((), _response, _ex, _sent, context))

        def end_playMusic(self, _r):
            return _M_mp3App.Function._op_playMusic.end(self, _r)

        def stopMusic(self, context=None):
            return _M_mp3App.Function._op_stopMusic.invoke(self, ((), context))

        def stopMusicAsync(self, context=None):
            return _M_mp3App.Function._op_stopMusic.invokeAsync(self, ((), context))

        def begin_stopMusic(self, _response=None, _ex=None, _sent=None, context=None):
            return _M_mp3App.Function._op_stopMusic.begin(self, ((), _response, _ex, _sent, context))

        def end_stopMusic(self, _r):
            return _M_mp3App.Function._op_stopMusic.end(self, _r)

        @staticmethod
        def checkedCast(proxy, facetOrContext=None, context=None):
            return _M_mp3App.FunctionPrx.ice_checkedCast(proxy, '::mp3App::Function', facetOrContext, context)

        @staticmethod
        def uncheckedCast(proxy, facet=None):
            return _M_mp3App.FunctionPrx.ice_uncheckedCast(proxy, facet)

        @staticmethod
        def ice_staticId():
            return '::mp3App::Function'
    _M_mp3App._t_FunctionPrx = IcePy.defineProxy('::mp3App::Function', FunctionPrx)

    _M_mp3App.FunctionPrx = FunctionPrx
    del FunctionPrx

    _M_mp3App.Function = Ice.createTempClass()
    class Function(Ice.Object):

        def ice_ids(self, current=None):
            return ('::Ice::Object', '::mp3App::Function')

        def ice_id(self, current=None):
            return '::mp3App::Function'

        @staticmethod
        def ice_staticId():
            return '::mp3App::Function'

        def sendPlayList(self, seq, current=None):
            raise NotImplementedError("servant method 'sendPlayList' not implemented")

        def add(self, son, current=None):
            raise NotImplementedError("servant method 'add' not implemented")

        def remove(self, name, current=None):
            raise NotImplementedError("servant method 'remove' not implemented")

        def searchByName(self, name, current=None):
            raise NotImplementedError("servant method 'searchByName' not implemented")

        def searchByGenre(self, genre, current=None):
            raise NotImplementedError("servant method 'searchByGenre' not implemented")

        def searchByArtist(self, name, current=None):
            raise NotImplementedError("servant method 'searchByArtist' not implemented")

        def printPlayList(self, current=None):
            raise NotImplementedError("servant method 'printPlayList' not implemented")

        def receivePlaylist(self, current=None):
            raise NotImplementedError("servant method 'receivePlaylist' not implemented")

        def playMusic(self, current=None):
            raise NotImplementedError("servant method 'playMusic' not implemented")

        def stopMusic(self, current=None):
            raise NotImplementedError("servant method 'stopMusic' not implemented")

        def __str__(self):
            return IcePy.stringify(self, _M_mp3App._t_FunctionDisp)

        __repr__ = __str__

    _M_mp3App._t_FunctionDisp = IcePy.defineClass('::mp3App::Function', Function, (), None, ())
    Function._ice_type = _M_mp3App._t_FunctionDisp

    Function._op_sendPlayList = IcePy.Operation('sendPlayList', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), _M_mp3App._t_playList, False, 0),), (), None, ())
    Function._op_add = IcePy.Operation('add', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), _M_mp3App._t_Song, False, 0),), (), None, ())
    Function._op_remove = IcePy.Operation('remove', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), None, ())
    Function._op_searchByName = IcePy.Operation('searchByName', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), None, ())
    Function._op_searchByGenre = IcePy.Operation('searchByGenre', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), None, ())
    Function._op_searchByArtist = IcePy.Operation('searchByArtist', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (((), IcePy._t_string, False, 0),), (), None, ())
    Function._op_printPlayList = IcePy.Operation('printPlayList', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (), (), None, ())
    Function._op_receivePlaylist = IcePy.Operation('receivePlaylist', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (), (), ((), _M_mp3App._t_playList, False, 0), ())
    Function._op_playMusic = IcePy.Operation('playMusic', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (), (), None, ())
    Function._op_stopMusic = IcePy.Operation('stopMusic', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, None, (), (), (), None, ())

    _M_mp3App.Function = Function
    del Function

# End of module mp3App
