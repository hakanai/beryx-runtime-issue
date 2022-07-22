plugins {
    application
    id("org.beryx.runtime") version "1.12.7"
}

dependencies {
    implementation(project(":lib"))
}

application {
    mainClass.set("com.example.app.Main")
}
