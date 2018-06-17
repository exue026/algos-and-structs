# Given an array, finds the element that would be at position k of the sorted array
# basically the partition algorithm used in quicksort
# O(n) time

def quick_select(index, array):
    p_index, p_val = partition(choose_pivot(array), array)
    if p_index == index:
        return p_val
    if p_index > index:
        return quick_select(index, array[:p_index])
    if p_index < index:
        return quick_select(index - p_index - 1, array[p_index + 1:])

def choose_pivot(array):
    return len(array) - 1

def partition(pivot, array):
    array[-1], array[pivot] = array[pivot], array[-1]
    low = 0
    high = len(array) - 2
    length = len(array)
    while True:
        while low < length - 1 and array[low] < array[-1]:
            low += 1
        while high >= 0 and array[high] > array[-1]:
            high -= 1
        if low >= high:
            break
        array[low], array[high] = array[high], array[low]
    array[low], array[-1] = array[-1], array[low]
    return low, array[low]

print(quick_select(3, [30,60,10,0,50,80,90,20,40,70]))

