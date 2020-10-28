plugins {
    java
}


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.graalvm.js:js:20.2.0")
    testImplementation("org.junit.jupiter", "junit-jupiter", "5.7.0")
}

java {
    version = JavaVersion.VERSION_15
}

tasks {
    test {
        useJUnitPlatform()
    }
}


