[![](https://jitpack.io/v/guidovezzoni/entest.svg)](https://jitpack.io/#guidovezzoni/entest)

# EnTest
Embedded tests for your app.

The purpose of this little library is to provide a simple way to handle tests in your app, possibly in a user-facing context - for example if your app needs to run test against a specific hardware or platform or context.

Currently it only provides a basic way to execute tests and collect their results in a unit test style, matching expected and actual value.

In future I'd like to implement - at least - these feature:
- general tests with result collection - rather than expected vs actual value
- multithreading
- UI to show the progress

# Usage
Add the JitPack repository in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency
```
dependencies {
	        compile 'com.github.guidovezzoni:entest:0.1.0-alpha'
	}
```

# History

###### version 0.1.0 16/10/2017

First release

# License
```
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
```
