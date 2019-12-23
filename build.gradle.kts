allprojects {
  group = "org.example"
  version = "1.0-SNAPSHOT"
}

subprojects {

  repositories {
    mavenCentral()
    mavenLocal()
  }

  dependencies {
    val implementation by configurations
    implementation(kotlin("stdlib-jdk8"))
  }

}






