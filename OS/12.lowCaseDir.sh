#!/bin/bash
if [ -z "$1" ] || [ ! -d "$1" ]; then
    echo "Usage: $0 <directory>"
    exit 1
fi

cd "$1" || exit
for file in *; do
    if [ -f "$file" ] && [[ "$file" =~ [A-Z] ]]; then
        lower=$(echo "$file" | tr 'A-Z' 'a-z')
        if [ -e "$lower" ]; then
            echo "Warning: Not overwriting $lower"
        else
            mv "$file" "$lower"
        fi
    fi
done