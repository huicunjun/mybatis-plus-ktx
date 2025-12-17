plugins {
    kotlin("jvm") version "2.2.20"
}

group = "com.baomidou"
version = "3.5.15.3"
base.archivesName = "mybatis-plus-ktx"

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
