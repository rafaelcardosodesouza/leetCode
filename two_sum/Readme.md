# Two Sum Problem

## Description
This program solves the "Two Sum" problem, which requires finding the indices of two numbers in an array that add up to a given target.

## Problem Statement
Given:
- An array of integers `nums`
- An integer `target`

Return the indices of two numbers such that they add up to `target`. Each input is guaranteed to have exactly one solution, and the same element cannot be used twice. The solution can be returned in any order.

---

## Example Inputs and Outputs

### Example 1:
- **Input**: `nums = [2, 7, 11, 15], target = 9`
- **Output**: `[0, 1]`
- **Explanation**: Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

### Example 2:
- **Input**: `nums = [3, 2, 4], target = 6`
- **Output**: `[1, 2]`

### Example 3:
- **Input**: `nums = [3, 3], target = 6`
- **Output**: `[0, 1]`

---

## Constraints
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

---

## Algorithm Explanation
This solution uses a dictionary to achieve a time complexity of **O(n)**.

### Steps:
1. Initialize a dictionary to store previously seen numbers and their indices.
2. Iterate over the array:
   - Compute the complement (`target - num`).
   - Check if the complement exists in the dictionary:
     - If yes, return the indices of the current number and the complement.
     - If no, store the current number and its index in the dictionary.
3. Return the result.

---

## Python Implementation

```python
def two_sum(nums, target):
    # Dictionary to store values and their indices
    num_map = {}
    
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [num_map[complement], i]
        num_map[num] = i


##Follow-Up
Can you devise a solution with a time complexity less than O(n²)? The provided algorithm achieves O(n) by using a dictionary for efficient lookups.