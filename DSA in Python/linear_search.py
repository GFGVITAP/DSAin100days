def linear_search(arr, x):

  n = len(arr)
  for i in range(n):
    if arr[i] == x:
      return i
  return -1

# Example usage:
arr = [10, 20, 30, 40, 50]
x = 30
result = linear_search(arr, x)
if result != -1:
  print("Element is present at index", str(result))
else:
  print("Element is not present in array")
