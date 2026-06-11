#!/bin/bash

# Display the name of the program/script
echo "Name of the program: $0"

echo "Arguments passed:"

# Loop through each argument passed to the script
for arg in "$@"
do
    echo "$arg"
done