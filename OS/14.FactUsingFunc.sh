#!/bin/bash
factorial() {
    local n=$1
    if [ $n -le 1 ]; then
        echo 1
    else
        local prev=$(factorial $((n - 1)))
        echo $((n * prev))
    fi
}

if [ -z "$1" ]; then
    echo "Usage: $0 <number>"
    exit 1
fi

result=$(factorial "$1")
echo "Factorial of $1 is: $result"