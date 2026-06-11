{
    for(i=1;i<=NF;i++)
        count[$i]++
}
END{
    for(word in count)
        if(count[word] >= 5)
            print word, count[word]
}