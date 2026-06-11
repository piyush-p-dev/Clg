#!/bin/bash

echo "Enter first file:"
read f1

echo "Enter second file:"
read f2

echo "Enter output file:"
read out

sort "$f1" > temp1
sort "$f2" > temp2

cat temp1 temp2 > "$out"

rm temp1 temp2

echo "Merged Successfully"