# Calculadora e Conversor (Java)
## Versão 1.0

Programa de terminal em Java com uma calculadora e um conversor de unidades, navegados por menus em loop. Mini-projeto da Semana 1 do meu estudo de Java.

## Funcionalidades

**Calculadora**
- Soma, subtração, multiplicação, divisão, potência e resto
- Tratamento de divisão por zero

**Conversor de unidades**
- Celsius ↔ Fahrenheit
- Quilômetros ↔ milhas
- Quilogramas ↔ libras

**Geral**
- Menu principal e submenus com opção de voltar
- Validação de entrada (texto ou número fora do intervalo não derrubam o programa)
- Resultados com 2 casas decimais

## Como rodar

**Requisitos:** JDK 21 ou superior.

```bash
git clone https://github.com/Theu13/java-calculadora-conversor.git
cd java-calculadora-conversor
```

Depois execute o arquivo direto, sem compilar antes:

```bash
java --enable-preview --source 21 Main.java
```

> O programa usa o `void main()` simplificado, que no JDK 21 é recurso em preview e exige o `--enable-preview`. Em versões mais novas em que o recurso já é oficial, basta `java Main.java`.

Também dá para abrir a pasta no IntelliJ IDEA e rodar pelo botão de execução.

## Exemplo de uso

```
===============
Escolha uma opção:
1: Calculadora.
2: Conversor.
0: Sair.
===============
2
Bem-vindo ao Conversor de Unidades!
Escolha sua conversão:
1: Celsius → Fahrenheit.
...
1
Digite o valor:
100
O valor em Fahrenheit é: 212,00
```

## O que pratiquei

- Menus em loop com `while` e `switch`
- Leitura de entrada com `Scanner` e validação com `hasNextInt()` / `hasNextDouble()`
- Organização do código em métodos com uma responsabilidade cada
- Formatação de saída com `printf`

## Autor

Matheus ([@Theu13](https://github.com/Theu13))
