class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        newnode = Node(data)

        if self.head is None:
            self.head = newnode
            return

        temp = self.head

        while temp.next:
            temp = temp.next

        temp.next = newnode

    def display(self):
        temp = self.head

        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next

        print("None")

    def reverse(self):
        prev = None
        current = self.head

        while current:
            nxt = current.next
            current.next = prev
            prev = current
            current = nxt

        self.head = prev


sll = SinglyLinkedList()

sll.insert(10)
sll.insert(20)
sll.insert(30)

print("Original List:")
sll.display()

sll.reverse()

print("Reversed List:")
sll.display()