import java.util.Scanner;

public class Main {




    public static void main(String[] args){

        String dono = "";
        String decisao = "";
        boolean Logado = false;
        int tsenha = 0;
        double deposito = 0;
        int saque = 0;
        boolean abrirConta = false;
        double valorSaque = 0;
        double valorDeposito = 0;
        String criarConta = "";
        String usuarioNovo = "";
        int senha = 0;


        ContaBanco p1 = new ContaBanco();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++){System.out.println("");}
        System.out.println("Deseja Criar uma conta ? [S]/[N]");
        criarConta = sc.next().toUpperCase();
            while (!criarConta.equals("S") || !criarConta.equals("N") ) {

                if (criarConta.equals("S")) {
                        System.out.print("Digita um nome para seu usúario: ");
                        usuarioNovo = sc.next();
                        System.out.println("Digite uma senha: ");
                        senha = sc.nextInt();
                    p1.abrirConta();

                    break;
                }
                else if(criarConta.equals("N")){
                    System.out.println("Volte Sempre!");
                    break;
                }else{
                    System.out.println("Opção invalida! Digite outra opção.");
                    return;
                }
        }


        while (true) {
            while (!Logado){
                System.out.print("Digita seu usúario: ");
                dono = sc.next();

                System.out.print("Digita sua senha: ");
                tsenha = sc.nextInt();

                if (dono.equals(usuarioNovo) && tsenha == senha){
                    Logado = true;



                    break;
                }
            }

            for (int i = 0; i < 100; i++){System.out.println("");}

            System.out.println("Menu");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Encerrar conta");
            System.out.println("5 - Sair");

            decisao = "";

            System.out.print("Informe a opção desejada: ");

            while (!decisao.equals("1") && !decisao.equals("2") && !decisao.equals("3") && !decisao.equals("4")&& !decisao.equals("5")){
                decisao = sc.next().toLowerCase();
            }

            for (int i = 0; i < 100; i++){System.out.println("");}

            switch (decisao){
                case "1":
                    System.out.println("Saldo atual: " + p1.getSaldo());
                    break;
                case "2":
                    System.out.print("Valor a sacar: ");
                    valorSaque = sc.nextDouble();
                    p1.sacar(valorSaque);
                    break;
                case "3":
                    System.out.print("Valor a depositar: ");
                    valorDeposito = sc.nextDouble();
                    p1.depositar(valorDeposito);
                    break;
                case "4":
                    p1.fecharCOnta();
                case "5":
                    System.out.println("Conta deslogada.");
                    System.out.println("Volte Sempre!");
                    break;
                default:
                    System.out.println("Opção invalida! Digite outra opção.");
                    break;
            }

            try { Thread.sleep(3000);} catch (Exception e){e.printStackTrace();}

            for (int i = 0; i < 100; i++){System.out.println("");}

            if (decisao.equals("5")){
                break;
            }

            p1.setDono(dono);
            p1.setSenha(tsenha);
            p1.estadoAtual();
        }
    }
}