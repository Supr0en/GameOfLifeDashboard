// settings.gradle
pluginManagement {
   repositories {
      google {
         content {
            includeGroupByRegex("com\\.android.*")
            includeGroupByRegex("com\\.google.*")
            includeGroupByRegex("androidx.*")
         }
      }
      mavenCentral()
      gradlePluginPortal()
   }
}
dependencyResolutionManagement {
   repositories {
      google()
      mavenCentral()
   }
}
rootProject.name = "GOLDapp"
include(":app") // Include your app module
