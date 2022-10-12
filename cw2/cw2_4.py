slownik: int = {3: 3., 4: 3.5,1: 2.8,2: 6.5,5: 5.5}

slow1: int = dict(sorted(slownik.items()))
print(slow1)

slow2: int = dict(sorted(slownik.items(), key=lambda item: item[1]))
print(slow2)
