from Car import Car

def main():
    car1 = Car(20, 40)
    car1.add_fuel(30)
    car1.get_fuel_level()
    car1.drive(100)
    car1.get_fuel_level()
    car1.add_fuel(30)
    car1.get_fuel_level()
    car1.drive(1500)
    car1.get_fuel_level()

if __name__ == '__main__':
    main()