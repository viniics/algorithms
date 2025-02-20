1. Introdução à Keyword "synchronized":
    A keyword automatiza a solução de problemas relacionados a condições de corrida.
    Ela elimina a necessidade de implementar manualmente um mutex para controlar o acesso em zonas críticas do código.

2. Comparação dos Códigos:
    Código sem "synchronized":
        Ao executar este código, pode ocorrer um bug:
        O valor do contador pode ser alterado sem que seja exibida o print de que o contador foi incrementado.
        Esse comportamento se deve à falta de controle na execução concorrente, permitindo que múltiplas threads acessem a variável "contador" simultaneamente.

    Código com "synchronized":
        A aplicação da keyword garante a exclusão mútua no acesso ao método.
        Com isso, o problema é evitado, pois somente uma thread pode acessar por vez.

3. Uso Flexível da Keyword:
    Apesar da  keyword "synchronized" ter sido aplicada no método inteiro, ela também pode ser utilizada apenas em regiões críticas do código, a depender da situação.