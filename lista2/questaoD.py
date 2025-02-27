def isSuperSorte(num):
    qtd4 = 0
    qtd7 = 0
    numStr = str(num)
    if(len(numStr)%2!= 0):
        return False
    for x in numStr:
        if(x=="4"):
            qtd4+=1
        elif(x=="7"):
            qtd7+=1
        else:
            return False
    return qtd7==qtd4 and qtd4!=0

def nextMenor(num):
    resposta = num
    while(not isSuperSorte(resposta)):
        resposta+=1
    return resposta

num = int(input())
print(nextMenor(num))