plugins {
    id("java")

}
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {


    implementation ("com.fasterxml.jackson.core:jackson-databind:2.12.7.1")
    implementation("com.thegoate:restassured:0.15.17.202302242243")
    testImplementation ("io.rest-assured:xml-path:5.3.0")
    testImplementation ("io.rest-assured:json-path:5.3.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.24.2")
    compileOnly ("org.projectlombok:lombok:1.18.26")
    annotationProcessor ("org.projectlombok:lombok:1.18.26")

    testCompileOnly ("org.projectlombok:lombok:1.18.26")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.26")
}

tasks.test {
    useJUnitPlatform()
}


