class Stack:
    def __init__(self):
        self.stk=[0]*8
        self.top=-1

    def push(self):
        if self.top==8:
            print("stack is full")
        else:
            self.top+=1
            a=int(input("Enter the element: "))
            self.stk[self.top]=a
    
    def pop(self):
        if self.top==-1:
            print("stack is empty")
        else:
            self.stk[self.top]=0
            print("popped")
            self.top-=1

    
    def display(self):
        for i in range(self.top+1):
            print(self.stk[i])

stk1=Stack()
ch=int(input("Enter choice 1 for Push and 2 for pop 0 for exit: "))
while (ch!=0):
    if ch==1:
        stk1.push()
    elif ch==2:
        stk1.pop()

    ch=int(input("Enter choice 1 for Push and 2 for pop: "))
stk1.display()

