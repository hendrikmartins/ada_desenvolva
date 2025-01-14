## Requisitos:

*   **Validação de entrada:** O sistema deve ter uma regra que garanta que o peso e a altura sejam valores positivos.
*   **Método `calcularIMC()`:** Deve ser criado um método para calcular o IMC do indivíduo.
*   **Método `determinarCategoria()`:** Deve ser criado um método que, dado o IMC, determine a categoria de peso, seguindo os seguintes critérios:
    *   Abaixo de 18,5: Abaixo do peso
    *   Entre 18,6 e 24,9: Peso normal
    *   Entre 25 e 29,9: Sobrepeso
    *   Acima de 30: Obesidade

## Fórmula do IMC:

O IMC é calculado pela fórmula:
IMC = peso / (altura * altura)
Onde:

*   `peso` é o peso em quilogramas (kg).
*   `altura` é a altura em metros (m).