from klasy import Coin


def main():
    m1: Coin = Coin()
    print(m1.show_side())
    m1.throw()
    print(m1.show_side())

    m2: Coin = Coin()
    print(m2.show_side())
    m2.throw()
    print(m2.show_side())

    m3: Coin = Coin()
    print(m3.show_side())
    m3.throw()
    print(m3.show_side())


if __name__ == "__main__":
    main()
