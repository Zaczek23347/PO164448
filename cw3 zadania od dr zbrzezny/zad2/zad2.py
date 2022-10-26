from Adres import Adress


def main():
    house1 = Adress(15,'Gwiezdna','Olsztyn','10-720',4)
    house1.show()
    house2 = Adress(1,'Plac JP II', 'Olsztyn','10-900')
    print(house1.comes_before(house2))



if __name__ == "__main__":
    main()



