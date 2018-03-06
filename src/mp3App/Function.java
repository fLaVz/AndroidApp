// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `server.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package mp3App;

public interface Function extends com.zeroc.Ice.Object
{
    void sendPlayList(Song[] seq, com.zeroc.Ice.Current current);

    void add(Song son, com.zeroc.Ice.Current current);

    void remove(String name, com.zeroc.Ice.Current current);

    void searchByName(String name, com.zeroc.Ice.Current current);

    void searchByGenre(String genre, com.zeroc.Ice.Current current);

    void searchByArtist(String name, com.zeroc.Ice.Current current);

    void printPlayList(com.zeroc.Ice.Current current);

    Song[] receivePlaylist(com.zeroc.Ice.Current current);

    void playMusic(com.zeroc.Ice.Current current);

    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::mp3App::Function"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::mp3App::Function";
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_sendPlayList(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        Song[] iceP_seq;
        iceP_seq = playListHelper.read(istr);
        inS.endReadParams();
        obj.sendPlayList(iceP_seq, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_add(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        Song iceP_son;
        iceP_son = Song.ice_read(istr);
        inS.endReadParams();
        obj.add(iceP_son, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_remove(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_name;
        iceP_name = istr.readString();
        inS.endReadParams();
        obj.remove(iceP_name, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_searchByName(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_name;
        iceP_name = istr.readString();
        inS.endReadParams();
        obj.searchByName(iceP_name, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_searchByGenre(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_genre;
        iceP_genre = istr.readString();
        inS.endReadParams();
        obj.searchByGenre(iceP_genre, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_searchByArtist(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_name;
        iceP_name = istr.readString();
        inS.endReadParams();
        obj.searchByArtist(iceP_name, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_printPlayList(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        obj.printPlayList(current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_receivePlaylist(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        Song[] ret = obj.receivePlaylist(current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        playListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_playMusic(Function obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        obj.playMusic(current);
        return inS.setResult(inS.writeEmptyParams());
    }

    final static String[] _iceOps =
    {
        "add",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "playMusic",
        "printPlayList",
        "receivePlaylist",
        "remove",
        "searchByArtist",
        "searchByGenre",
        "searchByName",
        "sendPlayList"
    };

    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_add(this, in, current);
            }
            case 1:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 2:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 3:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 4:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 5:
            {
                return _iceD_playMusic(this, in, current);
            }
            case 6:
            {
                return _iceD_printPlayList(this, in, current);
            }
            case 7:
            {
                return _iceD_receivePlaylist(this, in, current);
            }
            case 8:
            {
                return _iceD_remove(this, in, current);
            }
            case 9:
            {
                return _iceD_searchByArtist(this, in, current);
            }
            case 10:
            {
                return _iceD_searchByGenre(this, in, current);
            }
            case 11:
            {
                return _iceD_searchByName(this, in, current);
            }
            case 12:
            {
                return _iceD_sendPlayList(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
