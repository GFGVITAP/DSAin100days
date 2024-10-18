def quick_sort(arr):
  if len(arr) <= 1:
    return arr

  pivot = arr[0]

  left = [x for x in arr[1:] if x < pivot]
  right = [x for x in arr[1:] if x >= pivot]

  left = quick_sort(left)
  right = quick_sort(right)

  return left + [pivot] + right

arr = [6401, 25, 13, 22, 11, 34, 56, 111, 348, 45]
print("Given array: ", arr)
sorted_arr = quick_sort(arr)
print("Sorted array:", sorted_arr)
