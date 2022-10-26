from __future__ import annotations

class Adress:

    def __init__(self, h_num: int, street: str, town: str, zipcode: str, apart_num: int = 0) -> None:
        self.h_num = h_num
        self.street = street
        self.town = town
        self.zipcode = zipcode
        self.apart_num = apart_num

    def show(self) -> None:
        print(f'Adres: {self.street} {self.h_num} ', end = '')
        if (self.apart_num != 0):
            print(f'{self.apart_num}')
        else:
            print('')

        print(f'Kod i miasto: {self.zipcode} {self.town}')

    def comes_before(self, other: Adress) -> bool:
        return self.zipcode < other.zipcode
