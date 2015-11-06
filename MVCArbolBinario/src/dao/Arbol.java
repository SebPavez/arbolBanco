package dao;

import dto.Cuenta;

public class Arbol<T> {
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }
    
    public boolean agregarNodo(Cuenta datoNuevo){
        if(this.raiz == null)
        {
            this.raiz = new Nodo(datoNuevo);
            return true;
        }
        else
        {
            return this.raiz.insertar(datoNuevo);            
        }        
    }
    /*Retorna una cuenta, usando como parámetro de entrada su número. Si la cuenta no existe, retorna null */
    public Cuenta buscarCuenta(int numeroCuenta){
        Nodo recorrido = this.raiz;
        while(recorrido.getDato().getNumero()!=numeroCuenta){
            if(recorrido.getDato().getNumero()>numeroCuenta)
            {
                recorrido = recorrido.getNodoIzq();
                if(recorrido==null)
                    return null;
            }
            if(recorrido.getDato().getNumero()<numeroCuenta){
                recorrido = recorrido.getNodoDer();
                if(recorrido==null)
                    return null;
            }
        }
        return recorrido.getDato();
    }
    
}