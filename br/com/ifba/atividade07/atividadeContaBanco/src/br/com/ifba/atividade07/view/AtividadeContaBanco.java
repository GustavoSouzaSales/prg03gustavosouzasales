package br.com.ifba.atividade07.view;

public class AtividadeContaBanco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(01);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(02);
        c2.setDono("Creusa");
        c2.abrirConta("CP");
        
        c1.depositar(300);
        c2.depositar(600);
        
        c1.sacar(200);
        c2.sacar(500);
        
        c2.sacar(250);
        c2.fecharConta();
        
        c1.estadoAtual();
        c2.estadoAtual();
        
    }
    
}
