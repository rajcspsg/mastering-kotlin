buildscript {
  repositories {
    maven {
      url = uri("https://plugins.gradle.org/m2/")
    }
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
  }
}

allprojects {
  group = "org.example"
  version = "1.0-SNAPSHOT"
}

subprojects {
  apply(plugin = "java")
  apply(plugin = "org.jetbrains.kotlin.jvm")

  repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
    google()
  }

  configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  dependencies {
    val implementation by configurations
    implementation(kotlin("stdlib-jdk8"))
  }

  tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
  }
  
}
