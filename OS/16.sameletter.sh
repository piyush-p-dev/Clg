#!/bin/bash
if [ ! -f FILE ]; then
    echo "Error: Create a text file named 'FILE' first."
    exit 1
fi

echo "Words with matching first and last characters:"
for word in $(cat FILE); do
    # Clean punctuation if any
    clean_word=$(echo "$word" | tr -d '[:punct:]')
    len=${#clean_word}
    
    if [ $len -gt 1 ]; then
        first_char=${clean_word:0:1}
        last_char=${clean_word:$((len-1)):1}
        
        if [ "$first_char" == "$last_char" ]; then
            echo "$clean_word"
        fi
    fi
done