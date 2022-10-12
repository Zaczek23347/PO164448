import numpy as np


a: float = np.array([[1.5, 2.], [3.3, 4.]])
b: float = np.array([[0.5, .1], [1.82, 1.3]])


def foo(m1: float, m2: float) -> float:
    return m1 * m2
print(foo(a, b))
