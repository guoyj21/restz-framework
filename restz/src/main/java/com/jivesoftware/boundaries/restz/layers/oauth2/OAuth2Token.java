package com.jivesoftware.boundaries.restz.layers.oauth2;

/**
 * Created by bmoshe on 4/2/14.
 */
public class OAuth2Token
{
    private String access_token;
    private String refresh_token;

    public String getAccess_token()
    {
        return access_token;
    }

    public void setAccess_token(String accessToken)
    {
        this.access_token = accessToken;
    }

    public String getRefresh_token()
    {
        return refresh_token;
    }

    public void setRefresh_token(String refreshToken)
    {
        this.refresh_token = refreshToken;
    }
}
