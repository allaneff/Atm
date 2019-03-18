public class ContaBanco {
    public int senha;
    private String dono;
    public double saldo;
    private boolean status;
    private String escolha = "";




    public void estadoAtual(){
        System.out.println("--------------[-]ATM[-]-----------------");
        System.out.println("Conta: " +getSenha());
        System.out.println("Dono: " +getDono());
        System.out.println("Saldo: " +getSaldo());
        System.out.println("Status: " +getStatus());
        System.out.println("------------------------------------------");

    }

    public void abrirConta() {
        this.setStatus(true);
        System.out.println("Conta Aberta com sucesso!");
    }

    public void fecharCOnta(){
        if(this.getSaldo() >0 ){
            System.out.println("Conta não podera ser fechada tem creditos");
        }
        else if(this.getSaldo() <0 ){
            System.out.println("Conta não pode ser fechada pois tem debitos");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }


    }

    public void depositar(double d){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+d);
            System.out.println("Deposito realizado na conta de " +this.getDono());
        }

    }

    public void sacar(double v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono() );
            } else{
                System.out.println("saldo insuficiente");
            }
        }else{
            System.out.println("impossivel sacar de uma conta fechada!");
        }

    }



    //Construtor
    public ContaBanco() {
        this.saldo= 0;
        this.status = false;
    }

    //Getters and Setters

    public int getSenha() {
        return senha;
    }

    public void setSenha(int numConta) {
        this.senha = numConta;
    }


    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



}

