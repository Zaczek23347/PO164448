slownik = {3: 50, 4: 30, 1: 20, 2: 80}
slownik2 = dict(sorted(slownik.items()))
slownik3 = dict(sorted(slownik.items(), key=lambda x: x[1]))
print(slownik)
print(slownik2)
print(slownik3)
