#!/bin/bash

echo "Enter Sentence:"
read line

count=$(echo "$line" | grep -o " " | wc -l)

echo "Number of blanks = $count"