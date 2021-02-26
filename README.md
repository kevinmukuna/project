#simple simulator for a stack


The project Hierarchy is as follows:

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
        ----- build.xml
        ----- project.iml
        ----- README.md        
    








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
>> cd src/main/java/simulator 
>> javac -d . *.java 
>> java -cp . simulator/Simulator
>> 