package com.kbsqa.ibsdk.rest;

public interface ApiResponseCallback <T> {
    void onSuccess(T result);
    void onError(String errorMessage);
}