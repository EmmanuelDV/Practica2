package Practica02;
import javax.swing.JOptionPane;
public class Cola {
    
    static Persona objMenu = new Persona ();

    public static void main(String[] args) {
       
        int opcion;
        String datos = "";
        do{
                    datos = "\nMenu de opciones\n"
                          + "[1] Crear arreglo\n"
                          + "[2] Ingresar nombres\n"
                          + "[3] Ingresar sueldo bruto\n"
                          + "[4] Mostrar datos\n"
                          + "[0] Salir";
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(datos));
            
            switch(opcion){
                case 0:
                    JOptionPane.showMessageDialog(null,"Salio del programa");
                    break;
                
                case 1:
                    objMenu.crearArreglo();
                    break;
                
                case 2:
                    objMenu.ingresarNombre();
                    break;    
                    
                case 3:
                    objMenu.ingresarPagoBruto();
                    break;
                    
                case 4:
                    objMenu.mostrarDatos();
                    break;     
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    
                    
            }
            
        }while (opcion != 0);
        
    }
    
}
