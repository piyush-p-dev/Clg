#!/bin/bash
echo "Program Name: $0"
echo "Arguments listed line by line:"
for arg in "$@"; do
    echo "$arg"
done