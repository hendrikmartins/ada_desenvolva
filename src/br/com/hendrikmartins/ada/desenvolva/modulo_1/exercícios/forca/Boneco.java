package br.com.hendrikmartins.ada.desenvolva.modulo_1.exercícios.forca;

public class Boneco {
    void imprimirBoneco(int tentativas) {
        switch (tentativas) {
            case 6:
                System.out.println("+-----+");
                System.out.println("|    |");
                System.out.println("|    ");
                System.out.println("|   ");
                System.out.println("|   ");
                System.out.println("|");
                System.out.println("-----------");
                System.out.println("/\\       /\\");
                break;
            case 5:
                System.out.println("+-----+");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   ");
                System.out.println("|   ");
                System.out.println("|");
                System.out.println("-----------");
                System.out.println("/\\       /\\");
                break;
            case 4:
                System.out.println("+-----+");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|    |");
                System.out.println("|   ");
                System.out.println("|");
                System.out.println("-----------");
                System.out.println("/\\       /\\");
                break;
            case 3:
                System.out.println("+-----+");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|");
                System.out.println("|   ");
                System.out.println("|");
                System.out.println("-----------");
                System.out.println("/\\       /\\");
                break;
            case 2:
                System.out.println("+-----+");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|   ");
                System.out.println("|");
                System.out.println("-----------");
                System.out.println("/\\       /\\");
                break;
            case 1:
                System.out.println("+-----+");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|   / ");
                System.out.println("|");
                System.out.println("-----------");
                System.out.println("/\\       /\\");
                break;
            case 0:
                System.out.println("+-----+");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|   / \\");
                System.out.println("|");
                System.out.println("-----------");
                System.out.println("/\\       /\\");
        }
    }
}

