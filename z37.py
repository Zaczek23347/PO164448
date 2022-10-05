import random
random.seed(123456)
randomlist = [random.randrange(1, 101) for i in range(200)]


wynik = 0

for i in randomlist:
    print(i)
    if i%2 != 0:
        wynik = wynik + 1

print(wynik)


