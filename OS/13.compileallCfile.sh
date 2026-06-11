#!/bin/bash
for file in *.c; do
    if [ -f "$file" ]; then
        # Extract filename without extension
        filename="${file%.c}"
        echo "Compiling $file..."
        gcc "$file" -o "$filename"
        
        if [ $? -eq 0 ]; then
            echo "Running $filename:"
            ./"$filename"
            echo "-----------------------"
        else
            echo "Compilation failed for $file"
        fi
    fi
done