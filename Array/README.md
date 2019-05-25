# Array

**All Start With Index 0**

## C++
```c
int arr1[10];
int arr[] = { 10, 20, 30, 40 };
int arr[6] = { 10, 20, 30, 40 }; // same as int arr[] = {10, 20, 30, 40, 0, 0}
```
## Java
```Java
int intArray[];<br>
intArray = new int[20];  // OR  int[] intArray = new int[20];
int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };

arr.length
arr.clone()   // override for class object
              // multidimension == will return false, but arr[0] == copy[0] will return true
```
The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types)

## Python List
```python
List = []
List = [['Geeks', 'For'] , ['Geeks']]
List = [1, 2, 4, 4, 3, 3, 3, 6, 5]
List = [1, 2, 'Geeks', 4, 'For', 6, 'Geeks']

List.append(1) // could be anything ( , ) [ , ] etc.
List.insert(3, 12) // insert 12 at index 3

List2 = ['For', 'Geeks']
List.append(List2)
List2.insert(0, 'Geeks')  // elements in List will also change
List.extend([8, 'Always']) // add all the elements in List without []

// accessing element
List[0]  List[0][2]

// accessing a element using negative indexing
List = [1, 2, 'Geeks', 4, 'For', 6, 'Geeks']
List[-1]  // 'Geeks'
List[-3]  // 'For'

List.remove(5)  // remove the element 5 not the index
List.pop()      // pop the last element in List
List.pop(2)     // pop the element at index 2

List[3:8]  // a List with elements from index 3 to 7
List[:-6]  // elements from index 0 to -7
List[5:]   // elements from index 5 to the end
List[:]    // all
List[::-1] // all the elements in reverse order
```

## Questions
### Basic
No.|Concept|Others
---|:-----:|------:
27|Remove Element| 
26|Remove Duplicates from Sorted Array| 
80|Remove Duplicates from Sorted Array II|  
277|Find the Celebrity| 
189|Rotate Array| 
41|First Missing Positive| 
299|Bulls and Cows| 
134|Gas Station| 
118|Pascal's Triangle|Low frequency
119|Pascal's Triangle II|Low frequency
169|Majority Element|Low frequency
229|Majority Element II|Low frequency
274|H-Index|
275|H-Index II|Binary Search
243|Shortest Word Distance|
244|Shortest Word Distance II|
245|Shortest Word Distance III|
217|Contains Duplicate|
219|Contains Duplicate II|Low frequency
220|Contains Duplicate III|Low frequency
55|Jump Game|
45|Jump Game II|
121|Best Time to Buy and Sell Stock|
122|Best Time to Buy and Sell Stock II|
123|Best Time to Buy and Sell Stock III|
188|Best Time to Buy and Sell Stock IV|
309|Best Time to Buy and Sell Stock with Cooldown|
11|Container With Most Water|
42|Trapping Rain Water|
334|Increasing Triplet Subsequence|
128|Longest Consecutive Sequence|
164|Maximum Gap|Bucket
287|Find the Duplicate Number|
135|Candy|Low frequency
330|Patching Array|Low frequency

### Median
No.|Concept|Others
---|:-----:|------:
4|Median of Two Sorted Arrays|
321|Create Maximum Number|Low frequency
327|Count of Range Sum|Low frequency
289|Game of Life|

### Interval
No.|Concept|Others
---|:-----:|------:
57|Insert Interval|
56|Merge Intervals|
252|Meeting Rooms|
253|Meeting Rooms II|
352|Data Stream as Disjoint Intervals|TreeMap

### Counter
No.|Concept|Others
---|:-----:|------:
239|Sliding Window Maximum|
295|Find Median from Data Stream|
53|Maximum Subarray|
325|Maximum Size Subarray Sum Equals k|
209|Minimum Size Subarray Sum|
238|Product of Array Except Self|
152|Maximum Product Subarray|
228|Summary Ranges|
163|Missing Ranges|

### Sort
No.|Concept|Others
---|:-----:|------:
88|Merge Sorted Array|
75|Sort Colors|
283|Move Zeroes|
376|Wiggle Subsequence|
280|Wiggle Sort|
324|Wiggle Sort II|
