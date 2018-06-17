class MaxHeap:
    def __init__(self):
        self.array = []

    def insert(self, val):
        self.array.append(val)
        if not self.is_empty():
            self.fix_up(len(self.array) - 1)

    def delete_max(self):
        if self.is_empty():
            return
        self.__swap(0, len(self.array) - 1)
        val = self.array.pop()
        if self.is_empty():
            return
        self.fix_down(0)
        return val

    def is_empty(self):
        return len(self.array) == 0
    
    def fix_up(self, index):
        while self.__parent(index) != -1 and self.array[index] > self.array[self.__parent(index)]:
            self.__swap(index, self.__parent(index))
            index = self.__parent(index)
    
    def fix_down(self, index):
        while self.__left_child(index) != 1 or self.__right_child(index) != 1:
            child_index = self.__left_child(index)
            if child_index == -1 or self.array[self.__right_child(index)] > self.array[child_index]:
                child_index = self.__right_child(index)
            if self.array[index] < self.array[child_index]:
                self.__swap(index, child_index)
                index = child_index
            else:
                return

    def __parent(self, index):
        if index == 0:
            return -1 
        return (index - 1) / 2
    
    def __left_child(self, index):
        child_index = 2 * index + 1
        return self.__get_child(child_index)
    
    def __right_child(self, index):
        child_index = 2 * index + 2
        return self.__get_child(child_index)
    
    def __get_child(self, index):
        if index < len(self.array):
            return index
        return -1
    
    def __swap(self, index1, index2):
        self.array[index1], self.array[index2] = self.array[index2], self.array[index1]


heap = MaxHeap()
