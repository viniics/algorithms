"""
Vasily tem um número a, que ele quer transformar em um número b. Para isso, ele pode fazer dois tipos de operações:

multiplicar o número atual por 2 (ou seja, substituir o número x por 2·x);
adicionar o dígito 1 à direita do número atual (ou seja, substituir o número x por 10·x + 1).
Você precisa ajudar Vasily a transformar o número a no número b usando apenas as operações descritas acima
ou descobrir que é impossível.

Observe que neste problema não é necessário minimizar o número de operações.
Basta encontrar qualquer maneira de transformar a em b.

Entrada
A primeira linha contém dois inteiros positivos a e b (1 ≤ a < b ≤ 109)
o número que Vasily tem e o número que ele deseja ter.

Saída
Se não houver maneira de obter b a partir de a, imprima "NO" (sem aspas).

Caso contrário, imprima três linhas. Na primeira linha, imprima "YES" (sem aspas).
A segunda linha deve conter um único inteiro k - o comprimento da sequência de transformação. Na terceira linha, imprima a sequência de transformações x1, x2, ..., xk, onde:

x1 deve ser igual a a,
xk deve ser igual a b,
xi deve ser obtido a partir de xi - 1 usando qualquer uma das duas operações descritas (1 < i ≤ k).
Se houver várias respostas, imprima qualquer uma delas.
"""

path = [int]
def vasily_helper(a, b):
    path.append(a)
    if(a>b):
        return False
    if(a==b):
        return True
    return vasily_helper(a*2,b) or vasily_helper((a*10)+1,b)



def vasily(a,b):
    if(vasily_helper(a,b)):
        print("YES")
        print(len(path))
        print(path)
    else:
        print("NO")

print(vasily(1,11))