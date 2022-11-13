#ParentNook Rule Engine

## Changelog
- V1 Getting started with a new project and creating an empty of running project.



## Overview of Design Phase #1
This is how the code structure looks in V1

```aidl
src
├── main
│   └── scala
│       ├── ParentsNookRuleEngine.scala
│       ├── dataStore
│       │   └── NookDataStore.scala
│       ├── model
│       │   └── NookParticipant.scala
│       └── util
│           └── 
└── test
    └── scala
```
Following is the directory structure and how code will be organized

```
**./build.sbt** - project definition , dependencies  etc

**./src** - Where all source code will live

**./src/main** - Implementation

**./src/main/datastore** - Implementation

**./src/main/model** - Implementation

**./src/main/util** - Implementation

**./src/test** - Unit Test for the code

**./src/test/scala** - Scala Unit Test for the code

**./src/test/scala/datastore** - Implementation

**./src/test/scala/model** - Implementation

**./src/test/scala/util** - Implementation

**./tools** - Any tooling which may help us in running the application code
```


## How to compile code and tests
####Using IntelliJ
* Grab an IntelliJ with Scala Plugin Installed
* Open build.sbt - This will open as a scala project
* Compile using sbt shell , command - `compile` . Should produce result like this

##how to install any dependencies

   `sbt compile` should download all dependencies (test framework lib) which are mentioned in `build.sbt` 


## How to run
#### Bare Bone way


#### More readable way

