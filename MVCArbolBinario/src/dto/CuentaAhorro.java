package dto;

public class CuentaAhorro extends Cuenta implements Interes {
    private final double TASA_AHORRO = 1.005;
    private int numGiros = 0;

    public CuentaAhorro() {
        super();
        this.numGiros = 0;        
    }

    public CuentaAhorro(int numero, Persona titular, double saldo) {
        super(numero, titular, saldo);
    }    

    public int getNumGiros() {
        return numGiros;
    }

    public void setNumGiros(int numGiros) {
        this.numGiros = numGiros;
    }        
    
    @Override
    public void girar(double monto) {
        if(this.getNumGiros()<5 && monto<=this.getSaldo()){
            this.setSaldo(this.getSaldo()-monto);        
            this.numGiros++;
        }
    }

    @Override
    public void imprimirCartola() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularReajuste() {
        if(this.getNumGiros()>5)
            return this.getSaldo()*Interes.TASA_REAJUSTE;
        else
            return this.getSaldo()*(Interes.TASA_REAJUSTE+this.TASA_AHORRO/this.getNumGiros());
    }
    
}
