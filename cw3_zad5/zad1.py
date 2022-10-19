from klasy import Punkt

def main():
    punkt = Punkt(5)
    nazwanypunkt = Punkt(3)
    print(Punkt.distance(punkt, nazwanypunkt))


if __name__ == "__main__":
    main()
