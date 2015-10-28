package org.scribe.builder.api;


import org.scribe.model.Token;

/**
 * Created by phil on 10/28/15.
 */
public class SevenDigitalApi extends DefaultApi10a {

    private static final String AUTHORIZE_URL = "http://jimbo.com/oauth/authorize?token=%s";

    @Override
    public String getAccessTokenEndpoint()
    {
        return null;
        //return "http://jimbo.com/oauth/access_token";
    }

    @Override
    public String getRequestTokenEndpoint()
    {
        return null;
        //return "http://jimbo.com/oauth/request_token";
    }

    @Override
    public String getAuthorizationUrl(Token requestToken)
    {
        return null;
        //return String.format(AUTHORIZE_URL, requestToken.getToken());
    }

}