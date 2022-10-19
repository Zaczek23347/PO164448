from klasy import Stat
from typing import List

def main():
    l1: List[float] = [4, 5.5, 3]
    l2: List[float] = [5, 3, -3.3]
    print(Stat(l1).suma())
    print(Stat(l2).suma())
    print(Stat(l1).min())
    print(Stat(l1).max())


if __name__ == "__main__":
    main()
