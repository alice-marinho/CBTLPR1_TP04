# CBTLPR1_TP04

# Classe `Data` em Java

Este projeto contém a implementação da classe `Data` e um programa de teste para manipulação de datas em Java. A classe `Data` oferece funcionalidades para validar, exibir e manipular datas, além de fornecer informações adicionais como se um ano é bissexto e quantos dias se passaram no ano até a data fornecida.

## Classe `Data`

### Atributos
- `dia` (int): O dia do mês.
- `mes` (int): O mês do ano.
- `ano` (int): O ano.

### Construtores
- `Data()`: Construtor padrão que solicita ao usuário a entrada dos valores para dia, mês e ano, validando a entrada.
- `Data(int d, int m, int a)`: Construtor que recebe o dia, mês e ano como parâmetros e inicializa os atributos se a data for válida.

### Métodos
- `void entraDia(int d)`: Define o dia se a data for válida.
- `void entraMes(int m)`: Define o mês se a data for válida.
- `void entraAno(int a)`: Define o ano se a data for válida.
- `void entraDia()`: Solicita ao usuário a entrada do dia e define o valor se for válido.
- `void entraMes()`: Solicita ao usuário a entrada do mês e define o valor se for válido.
- `void entraAno()`: Solicita ao usuário a entrada do ano e define o valor se for válido.
- `int retDia()`: Retorna o dia.
- `int retMes()`: Retorna o mês.
- `int retAno()`: Retorna o ano.
- `String mostra1()`: Retorna a data no formato `dd/mm/aaaa`.
- `String mostra2()`: Retorna a data no formato `dd/mesPorExtenso/ano`.
- `boolean bissexto()`: Verifica se o ano é bissexto.
- `int diasTranscorridos()`: Calcula o número de dias transcorridos no ano até a data fornecida.
- `void apresentaDataAtual()`: Imprime a data atual formatada.

### Validação de Data
O método privado `validaData(int d, int m, int a)` é utilizado para garantir que a data fornecida é válida. Ele considera anos bissextos e o número de dias em cada mês.

## Programa de Teste

A classe `Main` contém um programa de teste que demonstra o uso da classe `Data`:

1. **Criação de Data com Construtor Padrão**
   - Solicita entrada do usuário para dia, mês e ano.
   - Exibe a data formatada em dois formatos diferentes.
   - Verifica se o ano é bissexto e calcula os dias transcorridos no ano.
   - Apresenta a data atual.

2. **Modificação de Data com Métodos de Entrada com Parâmetros**
   - Modifica a data inicial usando os métodos `entraDia`, `entraMes` e `entraAno`.
   - Exibe a data formatada, verifica se o ano é bissexto e calcula os dias transcorridos.

3. **Modificação de Data com Métodos de Entrada Sem Parâmetros**
   - Solicita ao usuário a entrada dos valores de dia, mês e ano.
   - Exibe a data formatada, verifica se o ano é bissexto e calcula os dias transcorridos.

4. **Criação de Data com Construtor com Parâmetros**
   - Cria uma data com valores específicos e exibe a data formatada, verifica se o ano é bissexto e calcula os dias transcorridos.
   - Usa métodos para retornar o dia, mês e ano.

## Observações

- O código utiliza o `Scanner` para entrada do usuário e `DateFormat` para formatação da data atual.
- Exceções são tratadas para garantir que entradas inválidas sejam corretamente gerenciadas.

## Integrantes do projeto

- Alice Marinho da Silva Gomes: CB3025772
- Bianca Fonseca Dantas Ribeiro: CB3025683
