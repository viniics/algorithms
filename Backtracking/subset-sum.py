"""
Given an array arr[] of non-negative integers and a value sum,
the task is to check if there is a subset of the given array whose sum is equal to the given sum. 

Examples: 

Input: arr[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output: True
Explanation: There is a subset (4, 5) with sum 9.

For the recursive approach, there will be two cases (In both cases, the number of available elements decreases by 1)

Consider the ‘last’ element to be a part of the subset.
Now the new required sum = required sum – value of ‘last’ element.
Don’t include the ‘last’ element in the subset. Then the new required sum = old required sum.

Base Cases:
isSubsetSum(arr, n, sum) = false, if sum > 0 and n = 0
isSubsetSum(arr, n, sum) = true, if sum = 0
"""

def isSubsetSum(arr, n, sum):
    if(sum==0):
        return True
    if(n ==0):
        return False
    if(arr[n-1]>sum):
        return isSubsetSum(arr,n-1,sum)
    # Agora, segundo o algoritmo, vamos do ultimo index ate o primeiro de forma recursiva.
    return isSubsetSum(arr,n-1,sum) or isSubsetSum(arr,n-1,sum - arr[n-1])

arr = [3, 34, 4, 12, 5, 2]
print(isSubsetSum(arr,len(arr),3))
