import math


class SodaCan:

    def __init__(self, wys: float, prom: float) -> None:
        self.wys = wys
        self.prom = prom

    def get_volume(self) -> float:
        return self.wys * (self.prom ** 2) * math.pi

    def get_surface_area(self) -> float:
        return (2 * math.pi * self.prom ** 2) + (2 * math.pi * self.prom * self.wys)