# BuildingAndroidSdk
dummy app to learn how to build, use and deploy an android sdk

## How to use the dummy Sdk ##

Add the dependency in your `project's build.gradle` file

```
  allprojects{
    repositories{
      ...
      maven{url 'https://jitpack.io'}
    }
  }
```

Add this dependency in your `app's build.gradle` file

```
{
  ....
  dependencies{
    implementation 'com.github.Neo-glitch:BuildingAndroidSdk:(latest version)'
  }
}
```

### Additions function ###

* Takes in two integer numbers, adds them and return the int result

```java
MathUtils.performAdd(int a, int b);
```

### Going to the HelloActity screen for starting work ###
* Takes in the application context as an argument

```java
MathUtils.goToHelloActivity(int a, int b);
```
