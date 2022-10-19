from klasy import Rectangle
from typing import List
from funkcja import wypisz_pole


def main():
    r1: Rectangle = Rectangle(3, 5)
    r2: Rectangle = Rectangle(5, 5)
    r3: Rectangle = Rectangle(6, 4)
    lista: List[Rectangle] = [r1, r2, r3]

    [print(x.pole()) for x in lista] #python comprehension
    for x in lista: #zwykle wypisanie for'em
        print(x.pole())

    for x in lista:
        wypisz_pole(x)


if __name__ == "__main__":
    main()