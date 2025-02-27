
def sla(degraus,multiplo):
    solution = []
    degrausQueFalta = degraus
    
    if((degraus-degrausQueFalta)<multiplo):
        while(degrausQueFalta-2>=multiplo):
            degrausQueFalta-=2
            solution.append(2)

        while(degrausQueFalta!=0):
                degrausQueFalta-=1
                solution.append(1)

    if len(solution)%multiplo != 0:
         return -1              
    return len(solution)
degraus, multiplo = map(int, input().split())
lista = []
print(sla(degraus,multiplo))