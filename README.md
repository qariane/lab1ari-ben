[![Build Status](https://github.com/qariane/lab1ari-ben)

This build will always fail because it has 2 examples of failing tests:
one based on the source code, and one based on an incorrect test.

# Learning Objectives

* Simple Fizzbuzz example
* Building with Gradle (using the Gradle wrapper)



# System requirements

*Make sure to update to java 8 

# Running the Application

 Mac OS X:

    $ ./gradlew run
	

# To run the test on my terminal I need to use this command 

 Mac OS X:

    $ ./gradlew test
	

# Running the Application Outside Gradle

Unlike running the application using Gradle's `run` task,
this allows passing command-line arguments.

On Linux or Mac OS X:

    $ ./build/scripts/hello-java arg1 arg2 arg3

or

    $ java -jar build/lib/hello-java.jar arg1 arg2 arg3

On on Windows:

    > .\build\scripts\hello-java arg1 arg2 arg3

or

    > java -jar build\lib\hello-java.jar arg1 arg2 arg3
