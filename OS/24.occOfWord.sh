echo "Enter word:"
read word

echo "Enter filename:"
read file

awk -v w="$word" '
{
    for(i=1;i<=NF;i++)
        if($i==w)
            c++
}
END{
    print "Occurrences =",c
}' "$file"