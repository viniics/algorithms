def vasily(a, b):
    path = []
    
    while b >= a:
        path.append(b)
        if b == a:
            print("YES")
            print(len(path))
            print(" ".join(map(str, reversed(path))))
            return
        
        if b % 2 == 0:
            b //= 2
        elif b % 10 == 1:
            b //= 10
        else:
            break
    print("NO")
vasily(2, 162)
