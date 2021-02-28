#!/bin/bash

ant main

: ' self explanatory $* is the argument passed from terminal '
cd src/main/java/simulator  && javac -d . *.java && java -cp . simulator/Simulator $*
cd 
exit