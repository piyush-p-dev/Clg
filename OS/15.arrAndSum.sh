#!/bin/bash
read -p "Enter number of elements: " n
declare -a arr
sum=0

echo "Enter $n elements one by one:"
for ((i=0; i<n; i++)); do
    read -p "Element $((i+1)): " item
    arr[$i]=$item
    sum=$((sum + item))
done

echo "Array elements: ${arr[*]}"
echo "Summation of elements: $sum"