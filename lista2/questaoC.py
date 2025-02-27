
def sla(degraus,multiplo):
    solution = []
    degrausQueFalta = degraus
    
    while((degrausQueFalta)>multiplo):
        while(degrausQueFalta-2>=multiplo):
            degrausQueFalta-=2
            solution.append(2)

    if (degrausQueFalta == multiplo):
        while(degrausQueFalta!=0):
            degrausQueFalta-=1
            solution.append(1)
        return len(solution)         
    
    return -1
degraus, multiplo = map(int, input().split())
lista = []
print(sla(degraus,multiplo))