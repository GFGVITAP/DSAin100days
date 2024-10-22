class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap = {}
        n = len(nums)

        for i in range(n):
            complement = target - nums[i]
            if complement in numMap:
                return [numMap[complement], i]
            numMap[nums[i]] = i

        return []  # No solution found

if __name__ == "__main__":
    # Get user input for the array and target
    nums_input = input("Enter the elements of the array (separated by spaces): ")
    target = int(input("Enter the target value: "))

    # Convert the input string into a list of integers
    nums = [int(num) for num in nums_input.split()]

    # Create an instance of the Solution class
    solution = Solution()

    # Call the twoSum function with the user-provided input
    result = solution.twoSum(nums, target)

    # Print the result
    if result:
        print("Indices of the two numbers that add up to the target:", result)
    else:
        print("No solution found.")
