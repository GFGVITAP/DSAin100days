def binary_search(arr, first, last, key):
    while first <= last:
        mid = (first + last) // 2
        if arr[mid] < key:
            first = mid + 1
        elif arr[mid] == key:
            print("Element is found at index:", mid)
            break
        else:
            last = mid - 1

    if first > last:
        print("Element is not found!")


if __name__ == "__main__":
    arr = [10, 20, 30, 40, 50]
    key = 30
    last = len(arr) - 1
    binary_search(arr, 0, last, key)
