Including StorifyMe widget library

(inside app build.gradle)

1.Reference github repository:

repositories {
    def gprBaseUrl = "https://maven.pkg.github.com"
    def gprRepoOwner = "StorifyMe"
    def gprRepoId = "stories-widgets-android"
    maven {
        name = "GitHubPackages"
        url = uri("$gprBaseUrl/$gprRepoOwner/$gprRepoId")
        // Use github credentials for authentication
        credentials {
            username = 'your_github_username'
            password = 'your_github_private_access_token'
        }
    }
}

2.Explicitly use Java 8:

android {
    ...

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}

3.Include widget library dependency:

dependencies {
    ...

    implementation "com.storifyme:widget:<latest_package_version>"
}

Perform gradle sync in order to download all dependencies.


Authenticating with StorifyMe

Inside your app/src/main create assets folder and add storify.properties file with following content:

storify_account=your_storify_account
storify_token=your_storify_token