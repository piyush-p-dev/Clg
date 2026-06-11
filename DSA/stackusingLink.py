class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class StackLinkedList:
    def __init__(self):
        self.top = None

    def push(self, data):
        newnode = Node(data)

        newnode.next = self.top
        self.top = newnode

    def pop(self):
        if self.top is None:
            print("Stack Empty")
            return

        print("Popped:", self.top.data)
        self.top = self.top.next

    def display(self):
        temp = self.top

        while temp:
            print(temp.data)
            temp = temp.next