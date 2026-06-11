#!/bin/bash

while true
do
    echo "1.Search Employee"
    echo "2.Display emp_no and emp_sal"
    echo "3.Append Record"
    echo "4.Exit"

    read ch

    case $ch in

    1)
        echo "Enter emp_no:"
        read eno
        grep "^$eno" emp.txt
        ;;

    2)
        awk '{print $1,$3}' emp.txt
        ;;

    3)
        echo "Enter emp_no emp_name emp_sal:"
        read no name sal
        echo "$no $name $sal" >> emp.txt
        ;;

    4)
        exit
        ;;
    esac
done