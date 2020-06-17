import javax.swing.JOptionPane;
public class Persona {
    int num_trab;
    static String [] nombrearreglo;
    static int [] pagobrutoarreglo,essaludarreglo,fonaviarreglo,bonificacionarreglo,sueldoarreglo;
    
    
    
    public void crearArreglo(){
        num_trab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de trabajadores  : "));
    
        JOptionPane.showMessageDialog(null,"El arreglo fue creado ");
    }
    
    public void ingresarNombre(){
        String datos;
        datos = JOptionPane.showInputDialog("Ingrese nombre de trabajador : ");
        nombrearreglo = new String[num_trab];
        JOptionPane.showMessageDialog(null, datos);
    }
    
    public void ingresarPagoBruto(){
        String datos;
        datos = JOptionPane.showInputDialog("Ingrese pago bruto : ");
        pagobrutoarreglo = new int [num_trab];
        JOptionPane.showMessageDialog(null, datos);   
    }
    
    
    public void mostrarDatos(){
        String datos;
        
        JOptionPane.showMessageDialog(null,"La lista es:"+nombrearreglo+
                pagobrutoarreglo+
                essaludarreglo+fonaviarreglo+
                bonificacionarreglo);
 
    } 
    
    
}
