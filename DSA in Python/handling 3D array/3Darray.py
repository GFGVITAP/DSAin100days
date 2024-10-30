import numpy as np

def create_array(l, m, n):
    """Create a 3D array with user input."""
    array_3d = np.empty((l, m, n), dtype=int)
    print("Enter the elements of the 3D array:")
    for i in range(l):
        for j in range(m):
            for k in range(n):
                array_3d[i, j, k] = int(input(f"Element at ({i}, {j}, {k}): "))
    return array_3d

def display_array(array_3d):
    """Display the 3D array."""
    print("3D Array:")
    print(array_3d)

def access_element(array_3d):
    """Access a specific element."""
    i = int(input("Enter the index i (layer): "))
    j = int(input("Enter the index j (row): "))
    k = int(input("Enter the index k (column): "))
    print(f"Element at ({i}, {j}, {k}):", array_3d[i, j, k])

def modify_element(array_3d):
    """Modify a specific element."""
    i = int(input("Enter the index i (layer) to modify: "))
    j = int(input("Enter the index j (row) to modify: "))
    k = int(input("Enter the index k (column) to modify: "))
    new_value = int(input("Enter the new value: "))
    array_3d[i, j, k] = new_value
    print(f"Element at ({i}, {j}, {k}) modified to:", new_value)

def main():
    while True:
        print("\nMenu:")
        print("1. Create a 3D array")
        print("2. Display the 3D array")
        print("3. Access an element")
        print("4. Modify an element")
        print("5. Exit")
        
        choice = input("Choose an option (1-5): ")

        if choice == '5':
            print("Exiting the program.")
            break

        if choice == '1':
            l = int(input("Enter the number of layers (l): "))
            m = int(input("Enter the number of rows (m): "))
            n = int(input("Enter the number of columns (n): "))
            array_3d = create_array(l, m, n)

        elif choice == '2':
            if 'array_3d' in locals():
                display_array(array_3d)
            else:
                print("You need to create the array first!")

        elif choice == '3':
            if 'array_3d' in locals():
                access_element(array_3d)
            else:
                print("You need to create the array first!")

        elif choice == '4':
            if 'array_3d' in locals():
                modify_element(array_3d)
            else:
                print("You need to create the array first!")

        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
