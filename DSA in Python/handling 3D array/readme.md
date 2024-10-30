# 3D Array Handler in Python

This Python program allows users to create and manipulate a 3D array using a menu-driven interface. The program utilizes the numpy library for efficient array handling.

## Features

- Create a 3D Array: Users can input the dimensions and fill the array with their own values.
- Display the Array: View the current state of the 3D array.
- Access Specific Elements: Retrieve values from specific indices within the array.
- Modify Elements: Change values of specific elements in the array.

## Code Overview

- Importing NumPy: The program imports the numpy library to handle array operations.
```bash
import numpy as np
```

## Functions

### create_array(l, m, n)

- Purpose: Creates a 3D array and fills it with user input.
- Parameters:
l: Number of layers
m: Number of rows
n: Number of columns

### display_array(array_3d)

- Purpose: Displays the current state of the 3D array.

### access_element(array_3d)

- Purpose: Allows the user to access a specific element in the 3D array.

### modify_element(array_3d)

- Purpose: Allows the user to modify a specific element in the 3D array.

## Main Loop

- The program presents a menu to the user for various operations:

- Create an array
- Display the array
- Access an element
- Modify an element
- Exit
### NOTE: It checks if the array has been created before allowing access or modification.

## Running the Code

- Ensure you have Python and NumPy installed. You can install `NumPy` using: 
```bash 
pip install numpy
```

- Execute the code in any Python environment, such as a local installation, Jupyter Notebook, or an online Python interpreter.

## Example Usage

- The user is prompted to enter dimensions for the 3D array. After creating the array, the user can choose to display it, access specific elements, or modify elements as needed.