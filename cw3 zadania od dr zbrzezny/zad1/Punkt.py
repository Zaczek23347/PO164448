from __future__ import annotations

class Punkt:
    def __init__(self, x: float) -> None:
        self.x = x

    def distance(self, a: Punkt) -> float:
        if self.x > a.x:
            return self.x - a.x
        else:
            return a.x - self.x