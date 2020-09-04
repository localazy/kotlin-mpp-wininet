package com.localazy.example.http.wininet

import platform.windows.HINTERNET

data class ConnectHandle(
    val handle: HINTERNET
)