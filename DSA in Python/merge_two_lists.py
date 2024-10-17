class ListNode:
  def __init__(self, val=0, next=None):
    self.val = val
    self.next = next

def merge_two_lists(list1, list2):
  if list1 is None:
    return list2
  if list2 is None:
    return list1

  if list1.val < list2.val:
    head = list1
    list1 = list1.next
  else:
    head = list2
    list2 = list2.next

  current = head
  while list1 is not None and list2 is not None:
    if list1.val < list2.val:
      current.next = list1
      list1 = list1.next
    else:
      current.next = list2
      list2 = list2.next
    current = current.next

  current.next = list1 if list1 is not None else list2

  return head

if __name__ == "__main__":
  list1 = ListNode(1, ListNode(2, ListNode(4)))
  list2 = ListNode(1, ListNode(3, ListNode(4)))

  merged_list = merge_two_lists(list1, list2)

  while merged_list:
    print(merged_list.val, end=" -> ")
    merged_list = merged_list.next
  print("None")