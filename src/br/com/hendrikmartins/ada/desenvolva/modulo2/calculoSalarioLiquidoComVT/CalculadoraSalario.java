package br.com.hendrikmartins.ada.desenvolva.modulo2.calculoSalarioLiquidoComVT;


public class CalculadoraSalario {
    public static void main(String... args) {
        if (args.length != 5) {
            System.out.println("Erro: Formato de entrada inválido. Use: nome idade cargo salarioBase recebeValeTransporte");
            return;
        }

        String nome = args[0];
        int idade = Integer.parseInt(args[1]);
        String cargo = args[2];
        double salarioBase = Double.parseDouble(args[3]);
        boolean recebeVT = Boolean.parseBoolean(args[4]);

        Funcionario funcionario = new Funcionario(nome, idade, cargo, salarioBase, new CalcularDesconto(), new RecebeValeTransporte());

        double salarioLiquido = funcionario.calcularSalarioLiquido(recebeVT);
        try {
            System.out.printf("Funcionário: %s%n", nome);
            System.out.printf("Idade: %d%n", idade);
            System.out.printf("Cargo: %s%n", args[2]);
            System.out.printf("Recebe Vale-Transporte: %s%n", recebeVT ? "Sim" : "Não");
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Idade e salário base devem ser valores numéricos.");
        }
    }
}


