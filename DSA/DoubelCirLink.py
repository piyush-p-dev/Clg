class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None


class DoublyCircularLinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        newnode = Node(data)

        if self.head is None:
            self.head = newnode
            newnode.next = newnode
            newnode.prev = newnode
            return

        last = self.head.prev

        last.next = newnode
        newnode.prev = last

        newnode.next = self.head
        self.head.prev = newnode

    def display(self):
        if self.head is None:
            return

        temp = self.head

        while True:
            print(temp.data, end=" ")
            temp = temp.next

            if temp == self.head:
                break