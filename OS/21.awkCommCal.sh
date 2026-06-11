#!/bin/bash

BEGIN{
    print "This is the employee information"
    system("date")
}

{
    if($3<500)
        comm=$3*0.05
    else if($3>5000)
        comm=$3*0.10
    else
        comm=0

    totalSal += $3
    totalComm += comm
    count++

    print $1,$2,$3,$4,comm
}

END{
    print "No. of employees =",count
    print "Total Salary = Rs.",totalSal
    print "Total Commission = Rs.",totalComm
    print "Thanking you for seeing this report"
}