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

public interface FunctionPrx extends com.zeroc.Ice.ObjectPrx
{
    default void sendPlayList(Song[] seq)
    {
        sendPlayList(seq, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void sendPlayList(Song[] seq, java.util.Map<String, String> context)
    {
        _iceI_sendPlayListAsync(seq, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> sendPlayListAsync(Song[] seq)
    {
        return _iceI_sendPlayListAsync(seq, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> sendPlayListAsync(Song[] seq, java.util.Map<String, String> context)
    {
        return _iceI_sendPlayListAsync(seq, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_sendPlayListAsync(Song[] iceP_seq, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "sendPlayList", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     playListHelper.write(ostr, iceP_seq);
                 }, null);
        return f;
    }

    default void add(Song son)
    {
        add(son, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void add(Song son, java.util.Map<String, String> context)
    {
        _iceI_addAsync(son, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> addAsync(Song son)
    {
        return _iceI_addAsync(son, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> addAsync(Song son, java.util.Map<String, String> context)
    {
        return _iceI_addAsync(son, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_addAsync(Song iceP_son, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "add", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     Song.ice_write(ostr, iceP_son);
                 }, null);
        return f;
    }

    default void remove(String name)
    {
        remove(name, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void remove(String name, java.util.Map<String, String> context)
    {
        _iceI_removeAsync(name, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> removeAsync(String name)
    {
        return _iceI_removeAsync(name, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> removeAsync(String name, java.util.Map<String, String> context)
    {
        return _iceI_removeAsync(name, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_removeAsync(String iceP_name, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "remove", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_name);
                 }, null);
        return f;
    }

    default void searchByName(String name)
    {
        searchByName(name, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void searchByName(String name, java.util.Map<String, String> context)
    {
        _iceI_searchByNameAsync(name, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> searchByNameAsync(String name)
    {
        return _iceI_searchByNameAsync(name, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> searchByNameAsync(String name, java.util.Map<String, String> context)
    {
        return _iceI_searchByNameAsync(name, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_searchByNameAsync(String iceP_name, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "searchByName", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_name);
                 }, null);
        return f;
    }

    default void searchByGenre(String genre)
    {
        searchByGenre(genre, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void searchByGenre(String genre, java.util.Map<String, String> context)
    {
        _iceI_searchByGenreAsync(genre, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> searchByGenreAsync(String genre)
    {
        return _iceI_searchByGenreAsync(genre, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> searchByGenreAsync(String genre, java.util.Map<String, String> context)
    {
        return _iceI_searchByGenreAsync(genre, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_searchByGenreAsync(String iceP_genre, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "searchByGenre", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_genre);
                 }, null);
        return f;
    }

    default void searchByArtist(String name)
    {
        searchByArtist(name, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void searchByArtist(String name, java.util.Map<String, String> context)
    {
        _iceI_searchByArtistAsync(name, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> searchByArtistAsync(String name)
    {
        return _iceI_searchByArtistAsync(name, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> searchByArtistAsync(String name, java.util.Map<String, String> context)
    {
        return _iceI_searchByArtistAsync(name, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_searchByArtistAsync(String iceP_name, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "searchByArtist", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_name);
                 }, null);
        return f;
    }

    default void printPlayList()
    {
        printPlayList(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void printPlayList(java.util.Map<String, String> context)
    {
        _iceI_printPlayListAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> printPlayListAsync()
    {
        return _iceI_printPlayListAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> printPlayListAsync(java.util.Map<String, String> context)
    {
        return _iceI_printPlayListAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_printPlayListAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printPlayList", null, sync, null);
        f.invoke(false, context, null, null, null);
        return f;
    }

    default Song[] receivePlaylist()
    {
        return receivePlaylist(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Song[] receivePlaylist(java.util.Map<String, String> context)
    {
        return _iceI_receivePlaylistAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Song[]> receivePlaylistAsync()
    {
        return _iceI_receivePlaylistAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Song[]> receivePlaylistAsync(java.util.Map<String, String> context)
    {
        return _iceI_receivePlaylistAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Song[]> _iceI_receivePlaylistAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Song[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "receivePlaylist", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     Song[] ret;
                     ret = playListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default void playMusic()
    {
        playMusic(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void playMusic(java.util.Map<String, String> context)
    {
        _iceI_playMusicAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> playMusicAsync()
    {
        return _iceI_playMusicAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> playMusicAsync(java.util.Map<String, String> context)
    {
        return _iceI_playMusicAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_playMusicAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "playMusic", null, sync, null);
        f.invoke(false, context, null, null, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FunctionPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), FunctionPrx.class, _FunctionPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FunctionPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), FunctionPrx.class, _FunctionPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FunctionPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), FunctionPrx.class, _FunctionPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FunctionPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), FunctionPrx.class, _FunctionPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static FunctionPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, FunctionPrx.class, _FunctionPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static FunctionPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, FunctionPrx.class, _FunctionPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default FunctionPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (FunctionPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default FunctionPrx ice_adapterId(String newAdapterId)
    {
        return (FunctionPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default FunctionPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (FunctionPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default FunctionPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (FunctionPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default FunctionPrx ice_invocationTimeout(int newTimeout)
    {
        return (FunctionPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default FunctionPrx ice_connectionCached(boolean newCache)
    {
        return (FunctionPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default FunctionPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (FunctionPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default FunctionPrx ice_secure(boolean b)
    {
        return (FunctionPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default FunctionPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (FunctionPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default FunctionPrx ice_preferSecure(boolean b)
    {
        return (FunctionPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default FunctionPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (FunctionPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default FunctionPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (FunctionPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default FunctionPrx ice_collocationOptimized(boolean b)
    {
        return (FunctionPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default FunctionPrx ice_twoway()
    {
        return (FunctionPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default FunctionPrx ice_oneway()
    {
        return (FunctionPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default FunctionPrx ice_batchOneway()
    {
        return (FunctionPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default FunctionPrx ice_datagram()
    {
        return (FunctionPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default FunctionPrx ice_batchDatagram()
    {
        return (FunctionPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default FunctionPrx ice_compress(boolean co)
    {
        return (FunctionPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default FunctionPrx ice_timeout(int t)
    {
        return (FunctionPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default FunctionPrx ice_connectionId(String connectionId)
    {
        return (FunctionPrx)_ice_connectionId(connectionId);
    }

    static String ice_staticId()
    {
        return "::mp3App::Function";
    }
}