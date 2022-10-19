from klasy import Person


def main():
    p1 = Person()
    p1.name = "Jan"
    p1.surname = "Kowalski"
    p2 = Person()
    p2.name = "Adam"
    p2.surname = "Mickiewicz"
    print(p2.name, p2.surname)
    print(p1.name, p1.surname)


if __name__ == "__main__":
    main()
