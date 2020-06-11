package com.myandroid.loginandregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    final static private String URL = "php 파일";
    private Map<String, String> parameters;

    public LoginRequest(String memberID, String memberPassword, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("memberID", memberID);
        parameters.put("memberPassword", memberPassword);
    }

    @Override
    protected Map<String, String> getParams() {
        return parameters;
    }
}
