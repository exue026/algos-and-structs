
def interpolation_search(array, k):
    def recur(low, high):
        if array[low] > k or array[high] < k:
            return False
        if low == high:
            return array[low] == k
        index = low + ((k - array[low]) / (array[high] - array[low])) * (high - low)
        if array[index] == k:
            return True
        if array[index] > k:
            return recur(low, index - 1)
        return recur(index + 1, high)
    return recur(0, len(array) - 1)

print(interpolation_search([1,2,3,4,5,6,7], 10))
            