# PlatformManager [ ![Download](https://api.bintray.com/packages/gokulnathaws/gokulnath/com.gokul.platformmanager/images/download.svg) ](https://bintray.com/gokulnathaws/gokulnath/com.gokul.platformmanager/_latestVersion) [ ![TravisCI](https://travis-ci.org/gokulnathperiasamy/PlatformManager.svg?branch=master) ](https://travis-ci.org/gokulnathperiasamy/PlatformManager)

> A library project to checks if platform is BlackBerry / Android.

### API Documentation

###### Gradle Plugin

Library is available in jcenter repository. Add below line in your ```build.gradle``` file:

```
compile 'com.gokul.platformmanager:library:0.0.9'
```

###### Maven Dependency

```
<dependency>
  <groupId>com.gokul.platformmanager</groupId>
  <artifactId>library</artifactId>
  <version>0.0.9</version>
  <type>pom</type>
</dependency>
```

###### Ivy Dependency

```
<dependency org='com.gokul.platformmanager' name='library' rev='0.0.9'>
  <artifact name='library' ext='pom' ></artifact>
</dependency>
```

###### Direct Usage

Make sure you import the library project into your IDE and set this library as a dependency.

##### To check if platform is BlackBerry:

```
// Returns boolean - true if platform is BlackBerry
PlatformManager.isBlackBerry();
```


##### To check if platform is Android:

```
// Returns boolean - true if platform is Android
PlatformManager.isAndroid();
```


### Sample Usage

```
private void checkPlatformAndUpdate() {
    if (PlatformManager.isBlackBerry()) {
        // your custom code...
    }
}
```

### Author

- Gokul Nath KP

### Contribution Guidelines

Contributions are always welcome! Please read below guideline before contributing.

Please ensure your pull request adheres to the following guidelines:

- Search previous suggestions before making a new one, as yours may be a duplicate.
- Make an individual pull request for each suggestion.
- Keep descriptions short and simple, but descriptive.

Thank you for your suggestions!

### License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

