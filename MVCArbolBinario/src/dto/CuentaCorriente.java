package dto;
public class CuentaCorriente extends Cuenta{
    private double lineaCredito;

    public CuentaCorriente() {
        super();
        this.lineaCredito = 0.0;
    }

    public CuentaCorriente(double lineaCredito, int numero, Persona titular, double saldo) {
        super(numero, titular, saldo);
        this.lineaCredito = lineaCredito;
    }       

    public double getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(double lineaCredito) {
        this.lineaCredito = lineaCredito;
    }
    
    @Override
    public void girar(double monto) {
        if(monto<= this.getSaldo())
            this.setSaldo(this.getSaldo()-monto);
        else if(monto<=(this.getSaldo()+this.getLineaCredito())){
            this.setLineaCredito(monto-this.getSaldo());
            this.setSaldo(0);
        }
        else
            System.out.println("No hay credito suficiente");
    }

    @Override
    public void imprimirCartola() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
