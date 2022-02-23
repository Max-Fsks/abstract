
package modificadorabstract;


public abstract class conta {
    private String nome;
    private double saldo;
    
    public abstract double verificaSaldo();
    
    public void saque (double valor){
        if(valor<=this.saldo){
            this.saldo = this.saldo - valor;
        }
    }
}
