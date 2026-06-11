#!/bin/bash

merge()
{
    arr=("${a[@]}" "${b[@]}")
    echo "Merged Array:"
    echo "${arr[@]}"
}

a=(1 2 3)
b=(4 5 6)

merge