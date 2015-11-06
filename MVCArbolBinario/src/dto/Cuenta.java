package dto;

public abstract class Cuenta implements Informar {
    private int numero;
    private Persona titular;
    private double saldo;

    public Cuenta() {
        this.numero = 0;
        this.titular = new Persona();
        this.saldo = 0.0;
    }    
    
    public Cuenta(int numero, Persona titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    public void depositar (double monto){
        if(monto>0)
            this.saldo+=monto;
    }
    
    public abstract void girar(double monto);
    
    
}
