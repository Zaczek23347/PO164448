import numpy as np


a: float = np.array([[1.5, 2.], [3.3, 4.]])


def foo(m1: float) -> float:
    m1_odw: float = np.linalg.inv(m1)
    return m1_odw
print(foo(a))
