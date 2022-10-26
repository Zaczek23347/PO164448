class Car:

    def __init__(self, performance: float, max_fuel: float, curr_fuel: float = 0) -> None:
        self.performance = performance
        self.max_fuel = max_fuel
        self.curr_fuel = curr_fuel

    def get_fuel_level(self) -> None:
        print(f'Stan paliwa: {self.curr_fuel}/{self.max_fuel}')

    def add_fuel(self, tank: float) -> None:
        self.curr_fuel += tank
        if(self.curr_fuel > self.max_fuel):
            self.curr_fuel = self.max_fuel

    def drive(self, dist: float) -> None:
        self.curr_fuel -= dist / self.performance
        if (self.curr_fuel < 0):
            print('Nie dojechales!!')
            self.curr_fuel = 0

