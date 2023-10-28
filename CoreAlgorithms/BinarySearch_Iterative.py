

# Iterative Binary Search Function
# It returns index of x in given array arr if present,
# else returns -1
def binary_search(arr, x):
    low, high = 0, len(arr)-1   # initialize low and high pointers

    while (low <= high):  # perform binary search

        mid = (high+low)//2         # compute mid index

        if arr[mid] == x:     # if mid element is equal to x, return mid index
            return mid

        if arr[mid] > x:        # if mid element is greater than target, set high pointer to mid-1
            high = mid-1

        else:                       # if mid element is less than target, set low pointer to mid+1
            low = mid+1
    return -1


# Test array
arr = [2, 3, 4, 10, 40]
x = 10

# Function call
result = binary_search(arr, x)

if result != -1:
    print("Element is present at index", str(result))
else:
    print("Element is not present in array")
