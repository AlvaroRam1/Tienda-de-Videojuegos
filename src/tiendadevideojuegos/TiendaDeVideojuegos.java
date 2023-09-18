package tiendadevideojuegos;

import javax.swing.JOptionPane;

public class TiendaDeVideojuegos {

    public static void main(String[] args) {
        int opcion, cual, cuantos = 0, cliente = 0;
        String tipo = "", salida = "";
        double totalCliente = 0, caja = 0, continuar, descuentoAplicado = 0,cajaDescuento=0, descuento=0, cajaTotal = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1. Vender\n2. Ver Caja\nCualquier otro numero para salir"));
        while (opcion >= 1 && opcion <= 2) {
            if (opcion == 1) {//vender
                cliente += 1;
                continuar = 1;
                salida="";
                totalCliente=0.0;
                do {
    
                    cual = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a tienda Nintendo eShop!\nCliente #" + cliente + 
                            "\n\nSeleccione el tipo de Videojuego:\n1. Mario Party $70.00\n2. Super Smash Bros $75.00\n3. The Legend of Zelda $75.00\n4. Splatoon 3 $70.00\n5. Pokemon Legends Arceus $68.00\n6. Metroid Dread $65.00"));
                    
                    if (cual >= 1 && cual <= 6) {
                        switch (cual) {
                            case 1:
                                tipo = "Mario Party";
                                break;
                            case 2:
                                tipo = "Super Smash Bros";
                                break;
                            case 3:
                                tipo = "The Legend of Zelda";
                                break;
                            case 4:
                                tipo = "Splatoon 3";
                                break;
                            case 5:
                                tipo = "Pokemon Legends Arceus";
                                break;
                            case 6:
                                tipo = "Metroid Dread";
                                break;
                                
                        }
                        cuantos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Videojuegos de " + tipo + " desea? (entre 1 y 10)"));
                        if (cuantos >= 1 && cuantos <= 10) {
                            switch (cual) {
                                case 1://Americano
                                    salida = salida + "Videojuego: " + tipo + "\nCantidad: " + cuantos + "\nPrecio $70.00" + "\nSubtotal $" + (cuantos * 70.00) + "\n\n";
                                    totalCliente = totalCliente + (cuantos * 70.00);
                                    break;
                                case 2:
                                    salida = salida + "Videojuego: " + tipo + "\nCantidad: " + cuantos + "\nPrecio $75.00" + "\nSubtotal $" + (cuantos * 75.00) + "\n\n";
                                    totalCliente = totalCliente + (cuantos * 75.00);
                                    break;
                                case 3:
                                    salida = salida + "Videojuego: " + tipo + "\nCantidad: " + cuantos + "\nPrecio $75.00" + "\nSubtotal $" + (cuantos * 75.00) + "\n\n";
                                    totalCliente = totalCliente + (cuantos * 75.00);
                                    break;
                                case 4:
                                    salida = salida + "Videojuego: " + tipo + "\nCantidad: " + cuantos + "\nPrecio $70.00" + "\nSubtotal $" + (cuantos * 70.00) + "\n\n";
                                    totalCliente = totalCliente + (cuantos * 70.00);
                                    break;
                                case 5:
                                    salida = salida + "Videojuego: " + tipo + "\nCantidad: " + cuantos + "\nPrecio $68.00" + "\nSubtotal $" + (cuantos * 68.00) + "\n\n";
                                    totalCliente = totalCliente + (cuantos * 68.00);
                                    break;
                                case 6:
                                    salida = salida + "Videojuego: " + tipo + "\nCantidad: " + cuantos + "\nPrecio $65.00" + "\nSubtotal $" + (cuantos * 65.00) + "\n\n";
                                    totalCliente = totalCliente + (cuantos * 65.00);
                                    break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error en la cantidad");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error en el tipo de Videojuego");
                    }
                    continuar = Integer.parseInt(JOptionPane.showInputDialog("Cliente #" + cliente + "\nDesea seguir ordenando?\n1. Si\nCualquier otro numero para terminar la orden"));
                } while (continuar == 1);
                
                if(totalCliente>=100 || cuantos >= 5 ) {
                    
                    descuento = totalCliente*0.10;
                    descuentoAplicado= totalCliente - descuento ;
                    JOptionPane.showMessageDialog(null, "Cliente #" + cliente + "\n" + salida + "\nDescuento aplicado del 10% por su compra de $"+totalCliente+"\nTotal a pagar $"+descuentoAplicado);
                    
                } else  {
                    
                    JOptionPane.showMessageDialog(null, "Cliente #" + cliente + "\n" + salida + "\nTotal a pagar $" + totalCliente);   
                }
               
                caja = caja + totalCliente;
                cajaDescuento= cajaDescuento + descuento ;
                cajaTotal = caja - cajaDescuento;

            } else if (opcion == 2) {//ver caja
                JOptionPane.showMessageDialog(null, "Caja $" + caja+ "\nDescuento aplicados $"+cajaDescuento+"\nCaja total con descuento $"+cajaTotal+"\nClientes atendidos: " + cliente);
            }

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1. Vender\n2. Ver Caja\nCualquier otro numero para salir"));

        }
    }
    
}
