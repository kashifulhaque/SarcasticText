# SarcasticText

📚 Android Library to generate mock/sarcastic text like "wHaT's sO fUnNy."

![SarcasticText](https://github.com/kashifulhaque/SarcasticText/raw/master/app/screen.png)

# How to:

1. Add JitPack repository to your build file, if not present already.
JitPack: https://jitpack.io/#kashifulhaque/SarcasticText/0.1.0

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

```
dependencies {
  ...
  implementation 'com.github.kashifulhaque:SarcasticText:0.1.0'
}
```

3. Usage.

```
textView.setText(SarcasticText.makeSarcasticText("I am trying to be funny."));
```

**Changelog**
* 0.1.0
  * Initial commit, added the basic functionality.
