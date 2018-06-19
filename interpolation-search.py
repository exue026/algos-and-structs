
def interpolation_search(array, k):
    def recur(low, right):
        if array[low] > k or array[high] < k:
            return False
        if low == high:
            return array[low] == k
        index = low + ((k - array[low]) / (array[high] - array[low])) * (high - low)
        if array[index] == k

            