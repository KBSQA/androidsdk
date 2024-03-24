package com.kbsqa.ibsdk.callback;

public interface ApiResponseCallback<T> {
    void onSuccess(T result);

    void onError(String errorMessage);
}
