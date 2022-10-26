class Student:

    def __init__(self, name: str, surname: str,total_score: float = 0,quizes: int = 0) -> None:
        self.name = name
        self.surname = surname
        self.total_score = total_score
        self.quizes = quizes

    def get_name(self) -> str:
        return f'Imie i nazwisko: {self.name} {self.surname}'

    def add_quiz(self, score: float) -> None:
        self.total_score += score
        self.quizes += 1

    def get_total_score(self) -> float:
        return self.total_score

    def get_average_score(self) -> float:
        return self.total_score / self.quizes

