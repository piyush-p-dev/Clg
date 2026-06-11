#!/bin/bash

echo "Enter Username:"
read user

if grep "^$user:" /etc/passwd > /dev/null
then
    echo "Valid User"
else
    echo "Invalid User"
fi