class heapsort:

    def __init__(self,arr):
        self.arr=arr

    def sort(self):
        self._heapsort()
        return self.arr

    def _heapify(self,n,i):
        
        while True:
            left=2*i+1
            right=2*i+2
            largest=i
            if(left<n and self.arr[left]>self.arr[largest]):
                largest=left
            if(right<n and self.arr[right]>self.arr[largest]):
                largest =right
            if largest!=i:
                self.arr[i],self.arr[largest]=self.arr[largest],self.arr[i]
                i=largest
            else:
                break
            
    def _heapsort(self):
        n=len(self.arr)
        for i in range (n//2-1,-1,-1):
            self._heapify(n,i)
        for i in range(n-1,0,-1):
            self.arr[i],self.arr[0]=self.arr[0],self.arr[i]
            self._heapify(i,0)


if __name__ == "__main__":
    my_list = [10,7,8,9,1,5]
    sorter= heapsort(my_list)
    sorted_list=sorter.sort()
    print(f"sorted array: {sorted_list}")


