
package principal;

import javax.swing.JOptionPane;
import model.Restaurante;


public class Principal {
    public static void main(String[] args) {
        Restaurante corp = new Restaurante();
        int op = -1;
        while(op != 0){
        op = Integer.parseInt(JOptionPane.showInputDialog("1 - Preencher restaurante\n2 - Mostrar Restaurante\n0 - Sair do programa"));
        switch (op) {
            case 1:
                corp.leitura();
                break;
            case 2:
                corp.imprimir();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Obrigado por usar!");
                break;
            default:
            JOptionPane.showMessageDialog(null, "Digite um número válido");
            break;
        }
    }
    }
}
