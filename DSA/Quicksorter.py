# quick sort
# pivot p 

class Quicksorter:
    def __init__(self,arr):
        self.arr =arr
    
    def sort(self):
        self._quicksort(0,len(self.arr)-1)
        return self.arr

    def _quicksort(self,low,high):
        if low<high:
            pi=self._partition(low,high)
            self._quicksort(low,pi-1)
            self._quicksort(pi+1,high)

    def _partition(self,low,high):
        pivot=self.arr[high]
        i=low-1

        for j in range(low,high):
            if self.arr[j]<=pivot:
                i+=1
                self.arr[i],self.arr[j]=self.arr[j],self.arr[i]
        self.arr[i+1],self.arr[high]=self.arr[high],self.arr[i+1]
        return i+1
                
if __name__ == "__main__":
    my_list = [10,7,8,9,1,5]
    sorter= Quicksorter(my_list)
    sorted_list=sorter.sort()
    print(f"sorted array: {sorted_list}")


