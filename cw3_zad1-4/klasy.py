from random import randint
from typing import List


class Person:
    name = ""
    surname = ""


class Coin:
    def __init__(self) -> None:
        self.side = side

    def show_side(self) -> bool:
        return self.side

    def throw(self) -> bool:
        if randint(0,1):
            self.side = True
        else:
            self.side = False


class Rectangle:
    def __init__(self, a: int,b: int) -> None:
        self.a = a
        self.b = b

    def pole(self) -> int:
        return self.a * self.b


class Stat:
    def __init__(self, lista: List[float]) -> None:
        self.x = lista

    def suma(self) -> float:
        return sum(self.x)

    def min(self) -> float:
        return min(self.x)

    def max(self) -> float:
        return max(self.x)
