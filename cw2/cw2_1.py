import numpy as np


a = np.array([[1, 2], [3, 4]])
b = np.array([[0, 1], [1, 1]])


def foo(m1: int, m2: int) -> int:
    return m1 + m2
print(foo(a, b))
