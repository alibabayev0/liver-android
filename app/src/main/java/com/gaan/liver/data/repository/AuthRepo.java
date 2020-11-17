package com.gaan.liver.data.repository;

import com.gaan.liver.data.model.api.request.FacebookLoginRequest;
import com.gaan.liver.data.model.api.request.GoogleLoginRequest;
import com.gaan.liver.data.model.api.request.ServerLoginRequest;
import com.gaan.liver.data.model.api.response.LoginResponse;
import com.gaan.liver.data.remote.IAuthApi;

import javax.inject.Inject;

import io.reactivex.Single;

public class AuthRepo {

    private IAuthApi authApi;

    @Inject
    public AuthRepo(IAuthApi authApi) {
        this.authApi = authApi;
    }

    public Single<LoginResponse> postFacebookApiCall(FacebookLoginRequest facebookLoginRequest){
        return authApi.postFacebookApiCall(facebookLoginRequest);
    }

    public Single<LoginResponse> postGoogleApiCall(GoogleLoginRequest googleLoginRequest){
        return authApi.postGoogleApiCall(googleLoginRequest);
    }

    public Single<LoginResponse> postLoginApiCall(ServerLoginRequest serverLoginRequest){
        return authApi.postLoginApiCall(serverLoginRequest);
    }

}
