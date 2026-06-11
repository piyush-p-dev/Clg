#!/bin/bash

echo "1. List Files"
echo "2. Date"
echo "3. Process Status"
echo "4. Current Users"
echo "5. Present Working Directory"
echo "6. Exit"

read ch

case $ch in
1) ls ;;
2) date ;;
3) ps ;;
4) who ;;
5) pwd ;;
6) exit ;;
*) echo "Invalid Option"
esac