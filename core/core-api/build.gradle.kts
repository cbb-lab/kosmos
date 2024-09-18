dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":core:core-domain"))
    runtimeOnly(project(":infrastructure:database"))
}

tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}