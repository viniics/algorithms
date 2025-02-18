"""
O renomado chefe Matias está preparando NN pratos (numerados de 11 a NN).
Para cada ii válido, leva CiCi​ minutos para preparar o ii-ésimo prato.
Os pratos podem ser preparados em qualquer ordem.

Matias tem uma cozinha com dois fogões exatamente iguais.
Para cada ii válido, para preparar o ii-ésimo prato, ela o coloca em um dos fogões e após CiCi​ minutos,
o remove desse fogão; o prato não pode ser removido do fogão antes de esses CiCi​ minutos terem se passado,
pois caso contrário ele esfria e estraga.
Qualquer dois pratos podem ser preparados simultaneamente, entretanto,
nenhum dois pratos pode estar no mesmo fogão ao mesmo tempo.
Matias pode remover um prato de um fogão e colocar outro prato nesse mesmo fogão exatamente ao mesmo tempo.

Qual é o tempo mínimo necessário para preparar todos os pratos, isto é, para que todos estejam prontos?
Entrada

A primeira linha da entrada contém um único inteiro TT denotando o número de casos de teste.
A descrição dos TT casos de teste segue.
A primeira linha de cada caso de teste contém um único inteiro NN.
A segunda linha contém NN inteiros separados por espaço C1,C2,…,CNC1​,C2​,…,CN​.

Saída

Para cada caso de teste, imprima uma única linha contendo
um inteiro ― o menor número de minutos necessário para preparar todos os pratos.
Limites

1≤T≤1,0001≤T≤1,000
1≤N≤41≤N≤4
1≤Ci≤51≤Ci​≤5 para cada ii válido

"""

def chefe_matias(array):
    array = sorted(array, reverse=True)
    
    forno1 = array[0] if len(array) > 0 else 0
    forno2 = array[1] if len(array) > 1 else 0
    
    for time in array[2:]:
        if forno1 <= forno2:
            forno1 += time
        else:
            forno2 += time

    return max(forno1, forno2)



T = int(input().strip())
for _ in range(T):
    n = int(input().strip())
    array = list(map(int, input().split()))
    print(chefe_matias(array))