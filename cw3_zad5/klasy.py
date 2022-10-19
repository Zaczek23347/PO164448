class Punkt:
    def __init__(self, x: float) -> None:
        self.x = x

    def distance(self, a: float) -> float:
        if self.x > a.x:
            return self.x - a.x
        else:
            return a.x - self.x
