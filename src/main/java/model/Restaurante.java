
package model;

import javax.swing.JOptionPane;


public class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedio;
    
    public Restaurante() {
        this("","","","","","","",0);
    }
    public Restaurante(String nome,String endereco,String cidade,String estado,String cep,String fone, String tipoComida, double precoMedio){
        super(nome, endereco, cidade, estado, cep, fone);
        this.precoMedio = precoMedio;
        this.tipoComida = tipoComida;
    }
    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }
    @Override
    public String paraString(){
        return super.paraString()+"\nTipo de Comida: "+getTipoComida()+"\nPreço Médio: "+getPrecoMedio();
    }
    @Override
    public void leitura(){
        super.leitura();
        setPrecoMedio(Double.parseDouble(JOptionPane.showInputDialog("Preço Médio:")));
        setTipoComida(JOptionPane.showInputDialog("Tipo da Comida"));
    }
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null, paraString());
    }
}
