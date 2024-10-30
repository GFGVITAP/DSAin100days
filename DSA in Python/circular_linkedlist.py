class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class CircularLinkedList:
    def __init__(self):
        self.head = None

    def insert(self, val, k):
        new_node = Node(val)
        if self.head is None:
            # List is empty, initialize with the new node
            self.head = new_node
            new_node.next = new_node
        elif k == 1:
            # Insert at the beginning
            temp = self.head
            while temp.next != self.head:
                temp = temp.next
            new_node.next = self.head
            self.head = new_node
            temp.next = self.head
        else:
            # Insert at position k
            temp = self.head
            while (k - 2) > 0 and temp.next != self.head:
                temp = temp.next
                k -= 1
            new_node.next = temp.next
            temp.next = new_node

    def delete(self, k):
        if self.head is None:
            print("List is empty")
            return
        if k == 1:
            # Delete the first node
            temp = self.head
            tail = self.head
            while tail.next != self.head:
                tail = tail.next
            if self.head.next == self.head:
                # Only one node in the list
                self.head = None
            else:
                self.head = self.head.next
                tail.next = self.head
            print(f"Deleted: {temp.data}")
            del temp
        else:
            # Delete node at position k
            temp = self.head
            prev = None
            while (k - 1) > 0 and temp.next != self.head:
                prev = temp
                temp = temp.next
                k -= 1
            prev.next = temp.next
            print(f"Deleted: {temp.data}")
            del temp

    def print_list(self):
        if self.head is None:
            print("List is empty")
            return
        temp = self.head
        while True:
            print(temp.data, end=" ")
            temp = temp.next
            if temp == self.head:
                break
        print()

# Example usage
cll = CircularLinkedList()
print("hello\n")
cll.insert(111, 1)
cll.insert(2322, 2)
cll.insert(3333, 3)
cll.print_list()
cll.insert(4444, 2)
cll.print_list()
cll.delete(1)
print("Final list: ")
cll.print_list()
