plugins {
    kotlin("jvm") version "2.2.20"
}

group = "com.spring.kotlin.best"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))

    // https://mvnrepository.com/artifact/com.baomidou/mybatis-plus
    compileOnly("com.baomidou:mybatis-plus:3.5.15")
    // https://mvnrepository.com/artifact/com.baomidou/mybatis-plus-extension
    compileOnly("com.baomidou:mybatis-plus-extension:3.5.15")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
