#!/bin/bash
for file in *; do
    # Check if the file name contains uppercase letters
    if [[ "$file" =~ [A-Z] ]]; then
        lower=$(echo "$file" | tr 'A-Z' 'a-z')
        mv "$file" "$lower"
        echo "Renamed: $file -> $lower"
    fi
done