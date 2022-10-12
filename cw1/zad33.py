# zad33
import random

random.seed(123456)
randomList = [random.randrange(1,101) for i in range(200)]

randomList = list(set(randomList))
print(len(randomList))
