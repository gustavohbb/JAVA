/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_02poo;

/**
 *
 * @author gusta
 */
public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.print("Uma caneta "+ this.cor);
        System.out.print(" Modelo "+ this.modelo);
        System.out.print(" Ponta "+ this.ponta);
        System.out.print(" Carga %"+ this.carga);
        System.out.println(" Tampada "+ this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.print("Não posso rabiscar");
        } else {
            System.out.print("Rabiscando");
        }
    }
    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }
}
