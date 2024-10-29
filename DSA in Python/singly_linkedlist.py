
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def insert_at_beginning(self, val):
        new_node = Node(val)
        new_node.next = self.head
        self.head = new_node

    def insert_at_end(self, val):
        new_node = Node(val)
        if self.head is None:
            self.head = new_node
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node

    def insert_at_index(self, val, index):
        if index == 0:
            self.insert_at_beginning(val)
            return
        new_node = Node(val)
        temp = self.head
        for i in range(index - 1):
            if temp is None:
                raise IndexError("Index out of bounds")
            temp = temp.next
        new_node.next = temp.next
        temp.next = new_node

    def delete_at_beginning(self):
        if self.head is None:
            print("List is empty")
            return
        temp = self.head
        self.head = self.head.next
        print(f"Deleted: {temp.data}")
        del temp

    def delete_at_end(self):
        if self.head is None:
            print("List is empty")
            return
        temp = self.head
        if temp.next is None:
            self.head = None
            print(f"Deleted: {temp.data}")
            del temp
            return
        while temp.next.next:
            temp = temp.next
        print(f"Deleted: {temp.next.data}")
        del temp.next
        temp.next = None

    def delete_at_index(self, index):
        if self.head is None:
            print("List is empty")
            return
        if index == 0:
            self.delete_at_beginning()
            return
        temp = self.head
        for i in range(index - 1):
            if temp is None or temp.next is None:
                raise IndexError("Index out of bounds")
            temp = temp.next
        to_delete = temp.next
        temp.next = to_delete.next
        print(f"Deleted: {to_delete.data}")
        del to_delete

    def print_list(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")

# Example usage
sll = SinglyLinkedList()
sll.insert_at_beginning(10)
sll.insert_at_end(23)
sll.insert_at_end(35)
sll.insert_at_index(15, 1)
sll.print_list()  # Expected: 10 -> 15 -> 23 -> 35 -> None

sll.delete_at_beginning()
sll.print_list()  # Expected: 15 -> 20 -> 30 -> None

sll.delete_at_end()
sll.print_list()  # Expected: 15 -> 20 -> None

sll.delete_at_index(1)
sll.print_list()  # Expected: 15 -> None