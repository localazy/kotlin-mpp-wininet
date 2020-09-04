package com.localazy.example

import com.localazy.example.http.Http


fun main() {

    val url = "https://google.com"

    println("Downloading: $url...")
    println("")
    println(Http.get(url, emptyMap()) ?: error("Cannot download the content."))

}