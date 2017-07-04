package org.apache.cordova.x5engine;

/**
 * Created by zhangxitao on 16/9/14.
 */

import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;

import org.apache.cordova.ICordovaHttpAuthHandler;

/**
 * Specifies interface for HTTP auth handler object which is used to handle auth requests and
 * specifying user credentials.
 */
public class X5CordovaHttpAuthHandler implements ICordovaHttpAuthHandler {

    private final HttpAuthHandler handler;

    public X5CordovaHttpAuthHandler(HttpAuthHandler handler) {
        this.handler = handler;
    }

    /**
     * Instructs the XWalkView to cancel the authentication request.
     */
    public void cancel() {
        handler.cancel();
    }

    /**
     * Instructs the XWalkView to proceed with the authentication with the given credentials.
     *
     * @param username
     * @param password
     */
    public void proceed(String username, String password) {
        handler.proceed(username, password);
    }
}
