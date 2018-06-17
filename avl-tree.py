class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

class AVLtree:
    def __init__(self):
        self.root = None
    
    def insert(self, val):
        node = Node(val)
        self.__bst_insert(node)
    
    def __bst_insert(node):
        pass
    
    def __bst_delete(node):
