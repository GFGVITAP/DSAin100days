def counting_sort(arr):
    if not arr:
        return arr

    max_value = max(arr)

    # Step 2: Initialize the count array
    count_array = [0] * (max_value + 1)

    for value in arr:
        count_array[value] += 1

    for i in range(1, len(count_array)):
        count_array[i] += count_array[i - 1]

    output_array = [0] * len(arr)
    for value in reversed(arr):
        output_array[count_array[value] - 1] = value
        count_array[value] -= 1

    for i in range(len(arr)):
        arr[i] = output_array[i]

    return arr

def main():
    array = [4, 2, 2, 8, 3, 3, 1]
    
    print("Original Array:")
    print(array)
    
    sorted_array = counting_sort(array)
    
    print("\nSorted Array:")
    print(sorted_array)

if __name__ == "__main__":
    main()
