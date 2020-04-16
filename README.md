# SarcasticText 📋

📚 Android Library to generate mock/sarcastic text like "wHaT's sO fUnNy."

<img src="https://github.com/kashifulhaque/SarcasticText/raw/master/app/screen.png" width="320">


# How to:


1. Add JitPack repository to your build file, if not present already.

> Add the following code to your project level build.gradle file.

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```


2. Add the dependency.
> Add the following code to your app level build.gradle

```
dependencies {
  ...
  implementation 'com.github.kashifulhaque:SarcasticText:0.1.1'
}
```


3. Usage.

```
textView.setText(SarcasticText.generate("I am trying to be funny."));
```


**Changelog**
* 0.1.0 on December 27, 2019
  * Initial commit, added the basic functionality.
* 0.1.1 on April 17, 2020
  * Modified the method name.
