#!/bin/bash
pos=0
neg=0

for num in "$@"; do
    if [ $num -gt 0 ]; then
        ((pos++))
    elif [ $num -lt 0 ]; then
        ((neg++))
    fi
done

echo "Positive numbers count: $pos"
echo "Negative numbers count: $neg"