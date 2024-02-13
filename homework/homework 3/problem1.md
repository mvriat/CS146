Insertion Sort
Best Case: O(n)
This is when the array of values are completely sorted. You would make a total of (N-1) comparisons. Recall
that the first value of the array gets split with the rest, creating two subarrays. So the comparisons would
involve not N, but N-1.
Worst Case: O(n^2)
This is when the array is in descending order. For every number that you iterate through in the right
subarray, you have to compare it to each number in the left subarray. The left subarray continious to grow.
This would take take 1 + 2 + 3 + 4 + 5 + 6 + ... + (N - 1) comparisons. This turns out to be 
n(n-1)/2 as it is the formula for the sum of the first n natural numbers. You can ignore the constant and 
get n^2 - n which will be order of n^2.
Average Case: Theta(n^2)
This is about the same as the worst case because the elements would be in a random order and still have to
be compared to all elements in the left subarray as we did in worst case.
