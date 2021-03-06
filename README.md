# basic-scala-project.g8

A [giter8](https://github.com/n8han/giter8) template for generating a new Scala project.

## Overview

The giter8 template is configured for sbt 1.1.1 and scala 2.12.5 by default and includes:

* `main` and `test` source directories
* [Typesafe Config](https://github.com/typesafehub/config)
* [ScalaTest](http://www.scalatest.org/)
* [ScalaCheck](https://www.scalacheck.org)
* [sbt-scalariform](https://github.com/sbt/sbt-scalariform)
* [sbt-extras](https://github.com/paulp/sbt-extras) sbt build script
* [Maven Central](http://search.maven.org), [Typesafe](https://bintray.com/typesafe) and [Sonatype](http://central.sonatype.org) resolvers

These variables can be modified when the template is applied:

* `name`
* `organization`
* `version`
* `scala_version`
* `description`
* `github_id`
* `developer_url`
* `project_url`

## Basic Usage

To get started using the template:

```
brew install giter8
g8 jfrazee/basic-scala-project.g8
cd [PROJECT] && chmod 755 sbt
```

## Changelog

### 0.0.4

* Removed SBT buildinfo
* Restored sbt script from [paulp/sbt-extras](https://github.com/paulp/sbt-extras)
* Dependency updates:
    * Scala 2.12.5
    * SBT 1.1.1
    * Scalariform 1.8.2
    * Coursier 1.0.1

### 0.0.3

* Removed paulp sbt script since verbatim is broken in giter8 for now
* Dependency updates:
    * Scala 2.12.2
    * SBT 0.13.15
    * Typesafe Config 1.3.1
    * Scalatest 3.0.1
    * Scalacheck 1.13.4
    * Joda Convert 1.8

### 0.0.2

* Added empty reference.conf to resources
* Added Coursier for dependency resolution
* Updated directory layout to use package name
* Dependency updates:
    * Scala 2.11.8
    * SBT 0.13.13
    * SBT buildinfo 0.6.1
    * Scalariform 1.6.0
    * Latest sbt script from [paulp/sbt-extras](https://github.com/paulp/sbt-extras)

### 0.0.1

* Forked from [fayimora/basic-scala-project.g8](https://github.com/fayimora/basic-scala-project.g8)
* Added Typesafe Config to dependency list
* Added sbt-scalariform & sbt-buildinfo plugins and sbt-extras build script
* Updated package resolvers
* Added variables for Scala version, Github id, and developer & project URLs
