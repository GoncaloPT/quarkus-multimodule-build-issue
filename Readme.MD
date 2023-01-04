# Quarkus multimodule build issue

The goal of this app is to demonstrate possible fragility quarkus dev-mode has when using multi-module project.

## Overview

```
project
│   Readme.MD
│   pom.xml - parent
│
└─── application
│   └─── pom.xml
│   └─── < has controllers and downstream interaction, dependes on java ee > 
└─── bundle
│   └─── pom.xml
│   └─── < bundles dependencies together for the build, has all the quarkus dependencies, and service-core , abstracts code from chosen framework >
└─── service-api
│   └─── pom.xml
│   └─── < service API, interfaces only >
└─── service-core
│   └─── pom.xml
│   └─── < service-api implementations >

```

## Problem demonstration

1. build parent by executing:
   `mvn install`
1. Go to bundle project and run:
   `mvn compile quarkus:dev`
1. make a GET request to localhost:8080/api/dummy/
   `curl http://localhost:8080/api/dummy/`
   you should see DummyServiceImpl
1. Make a change in service-core, and return "anotherOne" instead of "DummyServiceImpl" and reload devMode
1. repeat step 3.
1. "anotherOne" should be displayed

## Outcome

By following the steps above, one could confirm that devMode works with multi-module project.  
Therefore, no problem was found in multi-module devMode.
