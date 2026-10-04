# Resolução exercício Beecrowd1067

## Descrição do problema
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

## Como Funciona
1. O programa recebe o valor limite via terminal e o armazena na variável `numeros`.
2. Uma estrutura de repetição `for` é iniciada a partir do número 1 (`int i = 1`).
3. O laço continua sua execução enquanto a variável de controle for menor ou igual ao limite informado (`i <= numeros`).
4. A cada iteração, o código incrementa a variável de controle de duas em duas unidades (`i = i + 2`), garantindo que apenas números ímpares sejam processados e impressos.