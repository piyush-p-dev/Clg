#!/bin/bash
read -p "Enter username to look up: " username

if grep -q "^$username:" /etc/passwd; then
    echo "User Information found:"
    grep "^$username:" /etc/passwd
else
    echo "Error: User '$username' does not exist."
fi