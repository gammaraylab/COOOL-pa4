#!/bin/bash

#openJ9's ..../j2sdk-image/bin/

# Check if OPENJ9_JAVA environment variable is set
if [ -z "$OPENJ9_JAVA" ]; then
  echo "Error: OPENJ9_JAVA environment variable is not set."
  exit 1
fi

# If folder doesn't exist, create it
if [ ! -d "sootOutput" ]; then
    mkdir sootOutput
fi
if [ ! -d "unoptimizedClassFiles" ]; then
    mkdir unoptimizedClassFiles
fi
if [ ! -d "testFiles" ]; then
    mkdir testFiles
fi

# compile the java files in PWD
$OPENJ9_JAVA/javac PA4.java
$OPENJ9_JAVA/javac ./testFiles/$1.java

# clean the sootOutput folder
rm -r -f  ./sootOutput/*.class 
rm -r -f  ./unoptimizedClassFiles/*.class 
mv ./testFiles/$1.class ./unoptimizedClassFiles

$OPENJ9_JAVA/java PA4 
echo Original:
$OPENJ9_JAVA/java  -cp ./unoptimizedClassFiles $1 
sleep 5
echo Optimized:
$OPENJ9_JAVA/java  -cp ./sootOutput $1

