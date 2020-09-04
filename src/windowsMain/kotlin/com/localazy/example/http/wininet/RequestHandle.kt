package com.localazy.example.http.wininet

import platform.windows.HINTERNET

data class RequestHandle(
    val handle: HINTERNET
)