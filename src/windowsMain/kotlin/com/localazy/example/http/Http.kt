package com.localazy.example.http

import com.localazy.example.http.wininet.WinInetHelper


actual object Http {

    actual fun get(url: String, headers: Map<String, String>): String? {
        return WinInetHelper.request(
            url = url,
            method = "GET",
            headers = headers,
            postData = null
        ) { responseCode, responseData ->
            if (responseCode != 200) {
                null
            } else {
                responseData.decodeToString()
            }
        }
    }

}
