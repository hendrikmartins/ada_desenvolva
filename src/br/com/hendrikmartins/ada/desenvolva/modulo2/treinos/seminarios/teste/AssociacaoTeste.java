package br.com.hendrikmartins.ada.desenvolva.modulo2.treinos.seminarios.teste;

import br.com.hendrikmartins.ada.desenvolva.modulo2.treinos.seminarios.dominio.Aluno;
import br.com.hendrikmartins.ada.desenvolva.modulo2.treinos.seminarios.dominio.Local;
import br.com.hendrikmartins.ada.desenvolva.modulo2.treinos.seminarios.dominio.Professor;
import br.com.hendrikmartins.ada.desenvolva.modulo2.treinos.seminarios.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua dos tolos.");
        Aluno aluno = new Aluno("Hendrik", 29);
        Professor professor = new Professor("João","Matemático");
        Aluno[] alunosParaSeminario = {};
        Seminario seminario = new Seminario("Teoria do Caos", alunosParaSeminario, local);

        Seminario[] seminariosDisp = {seminario};

        professor.setSeminarios(seminariosDisp);


        professor.imprime();




    }
}
