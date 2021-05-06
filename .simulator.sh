#!/bin/bash

function function_check_args () {
  java --version 
   if [ $? -eq 0 ]; then
       ant --version 
       if [ $? -eq 0 ]; then
          return 0
       else
          return 1
       fi
   fi
}

: ' self explanatory $* is the argument passed from terminal '
if function_check_args $1; then 
    ant main
    cd src/main/java/simulator  && javac -d . *.java && java -cp . simulator/Simulator $*
    cd
 else
    
 fi
 
exit
