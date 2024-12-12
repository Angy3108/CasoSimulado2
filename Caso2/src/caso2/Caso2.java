package caso2;

import javax.swing.JOptionPane;

public class Caso2 {

    public static void main(String[] args) {

        //iniciacion de matriz
        Habitaciones hotel[][] = new Habitaciones[2][3];

        //iniciacion de variables
        int op = 0;
        boolean des = true;
        int piso = 0;
        int cuarto = 0;
        int total = 0;
        int libre = 0;
        int ocupada = 0;
        int sucia = 0;
        int porceO = 0;
        int porceS = 0;
        int porceL = 0;
        int suma = 0;

        //asignacion del constructor a los nivles de la matriz
        hotel[0][0] = new Habitaciones(1, "Simple", 400, "ocupada");
        hotel[0][1] = new Habitaciones(2, "Doble", 800, "libre");
        hotel[0][2] = new Habitaciones(3, "Con cocina", 1500, "sucia");
        hotel[1][0] = new Habitaciones(4, "Simple", 450, "libre");
        hotel[1][1] = new Habitaciones(5, "doble", 900, "sucia");
        hotel[1][2] = new Habitaciones(6, "Con cocina", 2000, "ocupada");

        //Print de la matriz
        for (int i = 0; i < hotel.length; i++) {
            JOptionPane.showMessageDialog(null, "piso numero" + (i + 1));
            for (int j = 0; j < 3; j++) {
                JOptionPane.showMessageDialog(null, "Habitacion numero " + (j + 1));
                JOptionPane.showMessageDialog(null, hotel[i][j].ID + "\n" + hotel[i][j].tipo + "\n" + hotel[i][j].precio + "\n" + hotel[i][j].estado);

            }
        }

        //menu de modificación
        op = Integer.parseInt(JOptionPane.showInputDialog("Desea modificar alguna información \n 1. sí 2. no"));
        if (op == 1) {
            while (des) {

                //menu
                op = Integer.parseInt(JOptionPane.showInputDialog("Que desea modificar: \n 1. tipo. \n 2. precio\n 3. estado \n 4. salir"));
                switch (op) {
                    case 1:
                        //piso
                        piso = Integer.parseInt(JOptionPane.showInputDialog("Que piso desea editar"));
                        cuarto = Integer.parseInt(JOptionPane.showInputDialog("Que habitacion desea editar"));
                        hotel[piso - 1][cuarto - 1].setTipo(JOptionPane.showInputDialog("Tipo nuevo:"));
                        break;
                    case 2:

                        //precio
                        piso = Integer.parseInt(JOptionPane.showInputDialog("Que piso desea editar"));
                        cuarto = Integer.parseInt(JOptionPane.showInputDialog("Que habitacion desea editar"));
                        hotel[piso - 1][cuarto - 1].setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio nuevo:")));
                        break;
                    case 3:

                        //estado
                        piso = Integer.parseInt(JOptionPane.showInputDialog("Que piso desea editar"));
                        cuarto = Integer.parseInt(JOptionPane.showInputDialog("Que habitacion desea editar"));
                        hotel[piso - 1][cuarto - 1].setEstado(JOptionPane.showInputDialog("Estado nuevo:"));
                        break;
                    case 4:
                        //exit
                        des = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Ingreso una opcion incorrecta");
                }
            }
        }

        //calculo del tota de habitaciones, del porcentaje y de la gnancia total del hotel
        total = 2 * 3;
        JOptionPane.showMessageDialog(null, "el total de habitaciones que tiene el hotel es de+ " + total);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                if (hotel[i][j].estado.equals("ocupada")) {
                    ocupada = ocupada + 1;
                    suma = suma + hotel[i][j].precio;

                } else if (hotel[i][j].estado.equals("libre")) {
                    libre = libre + 1;

                } else {
                    sucia = sucia + 1;
                }

                porceO = (total / ocupada) * 100;
                porceS = (total / sucia) * 100;
                porceL = (total / libre) * 100;

                //print del porcentaje y el total 
                JOptionPane.showMessageDialog(null, "el total de habitaciones limpias es de: " + libre + "  y su porcentaje es: " + porceL + "\n el total de habitaciones ocupadas es de: " + ocupada + "y su porcentaje es de: " + porceO + "\n el total de habitaciones sucias es de: " + sucia + " y su porcentaje es de: " + porceS);

            }
        }

    }

}
          
                
               
                    
    

