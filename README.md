alltiny's common-lists is a Java module providing utility classes to deal with lists and list elements.

For instance:
- get a copy of a collection but exclude certain elements
- get a copy of a collection and join elements
- create a list of all possible combinations of the element in the list

## How to build?
alltiny-common-lists uses [gradle] for building. To compile and publish to your local maven repository use:
```sh
cd alltiny-common-lists
gradle publishToMavenLocal
```
the built module can be retrieved via:
```sh
<groupId>org.alltiny</groupId>
<artifactId>common-lists</artifactId>
<version>1.0.0</version>
```

## How to set up my development environment?
Depending on whether you use IntelliJ IDEA or Eclipse, [gradle] can create the project files for you:
* for IntelliJ IDEA
```sh
cd alltiny-common-lists
gradle idea
```

* for Eclipse
```sh
cd alltiny-common-lists
gradle eclipse
```

---
[gradle]:http://www.gradle.org - An open source building tool, much like maven, but rather more flexible.