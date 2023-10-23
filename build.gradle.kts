plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("io.appium:java-client:7.0.0")
    testImplementation("org.testng:testng:7.6.1")
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")
}

tasks.test {
    useTestNG()
    //useJUnitPlatform()
}