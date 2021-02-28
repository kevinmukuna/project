#Simple Simulator For a Stack
for better viewing of the following file please view it an IDE or an application with .md

#DIRECTORY STRUCTURE 

        project 
                ----- .idea
                |
                ----- build
                |           |
                |            --- classes > simulator
                |                                  |
                |                                   ---- All the compiled classes
                |            --- jar
                |                   |
                |                    ---- simulator.jar
                |
                ----- documentation
                |                   |
                |                    ---- All the generated html from the java doc
                ----- deploy
                |           |
                |           ---- All the deployment war files
                ----- lib 
                |         |
                |          ---- All the JUNit jars needed for Unit testing
                ----- src
                |        |
                |        --- main > java > simulator
                |                                   |
                |                                    ---- All the java classes
                |        --- test > java > simulator
                |                                   |
                |                                    ---- All the testing classes
                ----- .gitignore
                ----- build.properties
                ----- build.xml
                ----- project.iml
                ----- README.md        
    
#BRANCHES
        - master: used for the up to date running version of the software

        - develop: used for developing new features, addons and functionality for running version of the software
                this is only merged with master after it has been tested and assurance is given that it will not break
                the main software running under master branch

        - testing: this branch is used for unit testing of each functionality of new features, and the main software code
        
        - documentation: this branch is used for writing java doc and generating the java doc

#CODING CONVENTIONS
        - java coding conventions (camel cases when defining classes)

#BUILD COMMANDS FROM THE TOP OF THE DIR

        - explanation of the commands in the descending order 
          - ant -> runs the default method which is main and main runs all the target within the build file
          - ant clean -> clean deletes dirs for a clean build
          - ant init -> creates the file and dir needed for the build
          - ant compile -> compiles the java file
          - ant jar -> generates jar file from compiled classes
          - ant test -> runs the unit test
          - ant doc -> generates java doc
          - ant deploy -> deploys the application
          - ant main -> runs all the target above

        : run these commands individually to see it effectiveness or just run ant

        - ant
        - ant clean
        - ant init
        - ant compile
        - ant jar
        - ant test
        - ant doc
        - ant deploy
        - ant main




#AOB 

> This project implements a simulator for a stack(please view this file in ide or web to see it effectiveness)
> > The class stack is of generic type and implements delegation
> >> the class consist of 8 method (named below)
>>> --
> >>> - init()  this method calls in the constructor which then initialises the stack.
> >>> - push(E e) e is the value being pushed to the top of the stack which is of type E
> >>> - E pop() delete the item on top of the stack
> >>> - peek() returns the item on top of the stack
> >>> - show() this method prints each item in a new line
> >>> - isEmpty() returns a bool if the stack is empty or not.
> >>> - getSize() returns the size of the stack
> >>> - errorMessage() handles errors


> flow of execution to test the simulator from top dir
>> - cd src/main/java/simulator 
>> - javac -d . *.java 
>> - java -cp . simulator/Simulator
>>> run it one liner
>>>> cd src/main/java/simulator  && javac -d . *.java && java -cp . simulator/Simulator