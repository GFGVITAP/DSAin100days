def merge(arr, l, m, r):
    n1 = m - l + 1
    n2 = r - m
    L = arr[l:m + 1]
    R = arr[m + 1:r + 1]
    
    i = j = 0
    k = l
    
    while i < len(L) and j < len(R):
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1
    
    while i < len(L):
        arr[k] = L[i]
        i += 1
        k += 1
    
    while j < len(R):
        arr[k] = R[j]
        j += 1
        k += 1

def merge_sort(arr, l, r):
    if l < r:
        m = l + (r - l) // 2
        merge_sort(arr, l, m)
        merge_sort(arr, m + 1, r)
        merge(arr, l, m, r)

def print_array(arr):
    print(" ".join(arr))

if __name__ == "__main__":
    n = int(input("Enter n: "))
    arr = []

    print("Enter array elements:")
    for _ in range(n):
        arr.append(input().strip())

    print("Given Array:")
    print_array(arr)

    merge_sort(arr, 0, len(arr) - 1)

    print("\nSorted Array:")
    print_array(arr)
