fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/who") {
            call.respondText("Hello, World!")
        }
    }
}