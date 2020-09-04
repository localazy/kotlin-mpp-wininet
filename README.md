# Kotlin MPP + WinInet

When building a multiplatform app, a recommended library for HTTP communication would be the [ktor clients](https://ktor.io/clients/index.html). However, as it uses libcurl for desktop implementation, it introduces dependencies. On Linux or macOS, libcurl can be easily installed from repositories or through brew. For Windows, however, DLL libraries must be provided. 

The option would be to link libcurl statically. It's, however, a bit tricky and it leads to increased size of the resulting binary. 

If you only need a few simple HTTP calls, it may be much better to go with WinInet API that is included in Windows by default. 

**This project demonstrates how to use the WinInet API in your Kotlin MPP app for simple HTTP communication.** 

---

This code is based on what we have developed for [Localazy CLI](https://localazy.com). Read the original article about [how we built our Localazy CLI with Kotlin MPP and Github Actions](https://localazy.com/blog/localazy-cli-sofware-localization-tool-kotlin-github).


