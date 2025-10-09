package br.com.ifba.atividade07.view;
public class ContaBanco {
    // Atributos.
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos personalizados.
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        
        // Verifica se a conta é "CC" ou "CP". 
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        
        // Verifica se tem dinheiro ou débito na conta pra fechar.
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro.");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        
        // Verifica se a conta está aberta ou fechada para realizar o depósito.
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de" + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        
        // Verifica se tem saldo e se a conta tá aberta ou fechada para realizar o saque.
        if(this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        
        // Verifica o tipo da conta de tal pessoa, pois varia o "v".
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    
    // Métodos especiais.
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
