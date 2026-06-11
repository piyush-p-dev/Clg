#!/bin/bash
echo "Currently logged in users:"
who | awk '{print $1}' | sort -u

echo -e "\nRecent login/logout history history:"
last | head -n 15