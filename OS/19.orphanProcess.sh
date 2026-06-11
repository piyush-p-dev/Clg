#!/bin/bash

(
    (
        sleep 20 &
        exit
    )
)&

echo "Check using:"
echo "ps -elf | grep sleep"