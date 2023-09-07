package org.malestar.bank;

public class CrearCuenta {
    public static void main(String[] arg){
        Cuenta cuentaDeIridia = new Cuenta();
        System.out.printf("Saldo de la cuenta: %.2f \n", cuentaDeIridia.saldo);
        cuentaDeIridia.saldo = 10000;
        System.out.println("Saldo de la cuenta: " + cuentaDeIridia.saldo);
    }
}
