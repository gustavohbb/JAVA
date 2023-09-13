import java.util.Scanner;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private float saldo;

    public ContaBanco() {
        this.setStatus(false);
        this.saldo = 0f;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void infomacoesConta() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número da nova conta ");
        this.setNumConta(in.nextInt());
        System.out.print("\nDigite o tipo da conta CC ou CP ");
        this.setTipo(in.next());
        if (this.tipo.equals("CC")) {
            System.out.print(" Bônus de 50R$");
            setSaldo(50f);
        } else if (this.tipo.equals("CP")){
            System.out.println( "Bônus de 150R$");
            setSaldo(150f);
        } else {
            System.out.println("Tipo inválido tente novamente");
            return;
        }
        System.out.print("\nDigite seu nome ");
        this.setDono(in.next());
        System.out.printf("\nConta aberta\nNúmero %s\nTipo %s\nDono %s\n", this.numConta, this.tipo, this.dono);
        this.setStatus(true);
    }

    public void fecharConta() {
        if (!this.status) {
            System.out.println("Não há conta aberta em seu nome");
        } else if (this.saldo > 0){
            System.out.println("Conta com dinheiro saque para fechar");
        } else if (this.saldo < 0) {
            System.out.println("Você está devendo pague suas dívidas");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }

    public void depositar(float quantia) {
        Scanner in = new Scanner(System.in);
        if (!this.status) {
            System.out.println("Não há conta aberta");
        } else {
            this.setSaldo(getSaldo() + quantia);
            System.out.println("Seu saldo atual é de " + this.getSaldo());
        }
    }

    public void sacar(float v) {
        if (!this.status) {
            System.out.println("Não há conta aberta");
        } else if (this.saldo <= 0) {
            System.out.println("Não há dinheiro para sacar");
        } else {
            System.out.println("Digite a quantia a ser sacada: ");
            if (v > this.saldo) {
                System.out.println("Além do limite");
            } else {
                setSaldo(getSaldo() - v);
                System.out.println("Salado atual " + this.getSaldo());
            }
        }
    }

    public void pagarMensal() {
        float mensalidadeValor;
        if (!this.status) {
            System.out.println("Não há conta aberta");
        } else if (this.tipo.equals("CC")) {
            mensalidadeValor = 12f;
            if (this.saldo < mensalidadeValor) {
                System.out.println("Saldo insuficiente");
            } else {
                this.saldo -= mensalidadeValor;
                System.out.println("Mensalidade paga");
            }
        } else if (this.tipo.equals("CP")) {
            mensalidadeValor = 20f;
            if (this.saldo < mensalidadeValor) {
                System.out.println("Saldo insuficiente");
            } else {
                this.saldo -= mensalidadeValor;
                System.out.println("Mensalidade paga");
            }
        } else {
            System.out.println("Erro");
        }
    }
}