//Autor: Jesus Sanchez, Javier Cardoso, Cesar Repollet
package Hamburgueseria2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accion, tamanho, tipo, contador = 0, contadorPedidas = 0, num;
        ArrayList<Hamburguesa> ventas = new ArrayList<>();
        double precioTotal = 0;
        do {

            System.out.println("Que desea hacer");
            System.out.println("1: Realizar pedido");
            System.out.println("2: Servir pedido");
            System.out.println("3: Información");
            System.out.println("4: Carta de productos");
            System.out.println("5: Salir");
            accion = sc.nextInt();
            switch (accion) {
                case 1:
                    System.out.println("Insertar tamaño del pedido");
                    tamanho = sc.nextInt();
                    System.out.println("Insertar tipo del pedido");
                    tipo = sc.nextInt();
                    contador++;
                    ventas.add(new Hamburguesa(tamanho, tipo, contador));
                    break;
                case 2:
                    System.out.println("¿Que hamburguesa se va a servir?");
                    System.out.println(ventas);
                    num = sc.nextInt()-1;
                    ventas.get(num).servir();
                    contadorPedidas++;
                    System.out.println("Sirviendo " + ventas.get(num));
                    break;
                case 3:
                    System.out.println("Se han cocinado " + contador + " hamburguesas");
                    System.out.println("Se han servido " + contadorPedidas + " hamburguesas");
                    System.out.println("Valor total de lo ganado: ");
                    for(Hamburguesa objeto : ventas) {
                        precioTotal += objeto.getPrecio();
                    }
                    System.out.println(precioTotal);
                    break;
                case 4:
                    System.out.println("Hamburguesas: tipo: tamaño: precio:");
                    System.out.println("Vegana\t\t\t1\tPequeña\t  1€");
                    System.out.println("Vegana\t\t\t1\tMediana\t 1.5€");
                    System.out.println("Vegana\t\t\t1\tGrande \t  2€");
                    System.out.println("Simple\t\t\t2\tPequeña\t 1.5€");
                    System.out.println("Simple\t\t\t2\tMediana\t  2€");
                    System.out.println("Simple\t\t\t2\tGrande \t 2.5€");
                    System.out.println("Doble \t\t\t3\tPequeña\t  2€");
                    System.out.println("Doble \t\t\t3\tMediana\t 2.5€");
                    System.out.println("Doble \t\t\t3\tGrande \t  3€");
                    System.out.println("Tamaños: Pequeña:1 Mediana:2 Grande:3");
                break;
            }
        } while (accion != 5);
    }
}
