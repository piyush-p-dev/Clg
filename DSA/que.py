class Queue:
    def __init__(self):
        self.q = []

    def enqueue(self, data):
        self.q.append(data)

    def dequeue(self):
        if len(self.q) == 0:
            print("Queue Empty")
        else:
            print("Deleted:", self.q.pop(0))

    def display(self):
        print(self.q)


q = Queue()

q.enqueue(10)
q.enqueue(20)
q.enqueue(30)

q.display()
q.dequeue()
q.display()