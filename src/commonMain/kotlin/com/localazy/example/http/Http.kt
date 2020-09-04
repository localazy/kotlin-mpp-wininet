package com.localazy.example.http

expect object Http {

    /**
     * Download the requested URL and return it as strings if the response code is HTTP_OK.
     * Return null for error.
     */
    fun get(url: String, headers: Map<String, String>): String?

}