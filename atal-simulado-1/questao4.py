"""
Você já encontrou uma string diversa? Toda string não vazia é considerada diversa se
o número de ocorrências de cada caractere nela não exceder o número de caracteres distintos que ela possui.

Por exemplo:
a string "7" é diversa porque 7 aparece nela 1 vez e o número de caracteres distintos nela é  1
a string "77" não é diversa porque 7 aparece nela 2 vezes e o número de caracteres distintos nela é 1
a string "1010" é diversa porque tanto 0 quanto 1 aparecem nela 2 vezes
e o número de caracteres distintos nela é 2
a string "6668" não é diversa porque 6 aparece nela 3 vezes e o número de caracteres distintos nela é 2
É dada uma string s de comprimento n, consistindo apenas de dígitos de 0 a 9.
Encontre quantas de suas n(n+1)/2 substrings são diversas.

Uma string a é uma substring de uma string b se a pode ser obtida de b pela exclusão de vários
(possivelmente, nenhum ou de todos) caracteres do início e vários (possivelmente, nenhum ou de todos) do final.

Observe que se a mesma string diversa aparece em s várias vezes
cada ocorrência deve ser contada de forma independente.
Por exemplo, há duas substrings diversas em "77", ambas iguais a "7", portanto a resposta para a string "77" é 2.

Entrada
Cada teste contém vários casos de teste. A primeira linha contém um único inteiro
t (1≤t≤10^4) — o número de casos de teste.

A primeira linha de cada caso de teste contém um único inteiro n(1≤n≤10^5) — o comprimento da string s.

A segunda linha de cada caso de teste contém uma string s de comprimento n.
É garantido que todos os caracteres de s são dígitos de 0 a 9.

É garantido que a soma de n em todos os casos de teste não excede 10^5.

Saída
Para cada caso de teste, imprima um inteiro — o número de substrings diversas da string s dada.
"""

def count_different(s):
    already_read = []
    for i in s:
        if(i not in already_read):
            already_read.append(i)
    return len(already_read)

def is_diversa(s):
    for i in s:
        count = s.count(i)
        if(count>(count_different(s))):
            return False   
    return True

def diversas_iniciais(s):
    if len(s) == 1:
        return 1
    if(is_diversa(s)):
        return 1 + (diversas_iniciais(s[1:]))
    else:
        return diversas_iniciais(s[1:])
    
def diversas_finais(s):
    if len(s) == 1:
        return 1
    if(is_diversa(s)):
        return 1 + (diversas_finais(s[:-1]))
    else:
        return diversas_finais(s[:-1])
    
def diversas_meio(s):
    if(len(s)==1):
        return 1
    if(is_diversa(s)):
        return 1+diversas_meio(s[1:-1])
    else:
        return diversas_meio(s[1:-1])
    

def string_diversas(s):
    if len(s) == 1:
        return 1
    if(is_diversa(s)):
        return 1+ diversas_iniciais(s[1:]) + diversas_finais(s[:-1])+ diversas_meio(s[1:-1])
    else:
        return diversas_iniciais(s[1:]) + diversas_finais(s[:-1]) + diversas_meio(s[1:-1])
    


casos_teste = int(input())
for i in range (casos_teste):
    size_string = int(input())
    s = input()
    print(string_diversas(s))