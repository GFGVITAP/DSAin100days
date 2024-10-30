class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert(self, val, k):
        new_node = Node(val)
        if self.head is None:
            # Insert at the beginning if list is empty
            self.head = new_node
        elif k == 1:
            # Insert at the beginning
            self.head.prev = new_node
            new_node.next = self.head
            self.head = new_node
        else:
            # Insert at position k
            temp = self.head
            while (k - 2) > 0 and temp.next is not None:
                temp = temp.next
                k -= 1
            if temp.next is None:
                # Insert at the end
                temp.next = new_node
                new_node.prev = temp
            else:
                # Insert in the middle
                new_node.next = temp.next
                new_node.prev = temp
                temp.next.prev = new_node
                temp.next = new_node

    def delete(self, k):
        if self.head is None:
            print("List is empty")
            return
        elif k == 1:
            # Deletion at the beginning
            temp = self.head
            if self.head.next is None:
                self.head = None
            else:
                self.head = self.head.next
                self.head.prev = None
            print(f"Deleted: {temp.data}")
            del temp
        else:
            # Deletion at position k
            temp = self.head
            while (k - 1) > 0 and temp.next is not None:
                temp = temp.next
                k -= 1
            if temp.next is not None:
                # Delete in the middle
                temp.next.prev = temp.prev
                temp.prev.next = temp.next
            else:
                # Delete at the end
                temp.prev.next = None
            print(f"Deleted: {temp.data}")
            del temp

    def print_list(self):
        temp = self.head
        while temp is not None:
            print(temp.data, end=" ")
            temp = temp.next
        print()

# Example usage
dll = DoublyLinkedList()
dll.insert(11, 1)
dll.insert(22, 2)
dll.insert(33, 3)
dll.print_list()  # Expected output: 11 22 33
dll.delete(1)
dll.print_list()  # Expected output after deletion: 22 33
