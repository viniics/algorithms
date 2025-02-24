#O problema do troco consiste em acumular uma certa quantia somando o menor numero possível de moedas!

def calcula_troco(array,troco):
    soma_atual = 0
    moedas_para_entregar = []
    while(soma_atual<troco and len(array)>0):
        maior_atual = (max(array))
        if (soma_atual+maior_atual)<=troco:
            soma_atual += maior_atual
            moedas_para_entregar.append(maior_atual)
        array.pop(array.index(maior_atual))

    return "Troco = " + str(moedas_para_entregar)+ "!"


moedas_disponiveis = [int(x) for x in input("Insira as moedas disponíveis: ").split()] 
troco = int(input("Qual o troco? "))
print(calcula_troco(moedas_disponiveis,troco))

