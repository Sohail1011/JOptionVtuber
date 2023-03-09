package works;

import javax.swing.JOptionPane;
import models.Mesero;

public class Main {

    public static void main(String[] args) {
        Mesero mes = new Mesero();
//        mes1.setNombre("Robert");
//        mes1.setApellido("Aguirre");
//        mes1.setRol("Tabernero");
//
//        mes1.setNombre("Lunaria");
//        mes1.setApellido("Ayaren");
//        mes1.setRol("Vtuber");
//        System.out.println("El es: " + mes1.getNombre() + " , " + mes1.getApellido() + " , " + mes1.getRol());
        String casilla = JOptionPane.showInputDialog("Ingresa nombre tu vtuber");
        mes.setNombre(casilla);
        String apellido = JOptionPane.showInputDialog("Apellido");
        mes.setApellido(apellido);
        String role = JOptionPane.showInputDialog("¿Cuál es su trabajo?");
        mes.setRol(role);
        JOptionPane.showMessageDialog(null, "Ell@ es: " + mes.getNombre() + " " + mes.getApellido() + ". Su rol es ser: " + mes.getRol() + ".");
    }
}
