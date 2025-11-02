package ejercicionivelmedio;

import java.util.Scanner;
import java.util.HashSet;

public class EjercicioNivelMedio {

    public static void main(String[] args) {

        HashSet<Vendedor> coleccion = new HashSet<>();
        Scanner in = new Scanner(System.in);
        int opciones = 0;

        do {
            System.out.println("1.-Agregar vendedor");
            System.out.println("2.-Listar vendedores");
            System.out.println("3.-Eliminar vendedor");
            System.out.println("4.-Borrar todos");
            System.out.println("5.-Salir");
            System.out.print("Elija una opcion: ");
            opciones = in.nextInt();
            in.nextLine();

            switch (opciones) {
                case 1: {
                    System.out.print("Ingrese nombre: ");
                    String nombre = in.nextLine();
                    System.out.print("Ingrese sueldo: ");
                    double sueldo = in.nextDouble();
                    in.nextLine();
                    Vendedor v = new Vendedor(nombre, sueldo);
                    coleccion.add(v);
                    System.out.println("Vendedor agregado.");
                    break;
                }
                case 2:
                    while (opciones == 2) {
                        if (coleccion.isEmpty()) {

                            System.out.println("agrege nombre: ");
                            String accion = in.nextLine();
                            System.out.println("agrege sueldo: ");
                            double accion1 = in.nextDouble();
                            in.nextLine();
                            Vendedor v = new Vendedor(accion, accion1);
                            coleccion.add(v);
                            System.out.println(" listado: " + coleccion);
                        }
                    }
                        break;
                    
            
            case 3:
                    {
                        System.out.print("Nombre a eliminar: ");
                        String nombre = in.nextLine();
                        Vendedor encontrado = null;
                        for (Vendedor v : coleccion) {
                            if (v.getNombre().equalsIgnoreCase(nombre)) {
                                encontrado = v;
                                break;
                            }
                        }       if (encontrado != null) {
                            coleccion.remove(encontrado);
                            System.out.println("Vendedor eliminado.");
                        } else {
                            System.out.println("No se encontró ese nombre.");
                        }       break;
                    }
                case 4:
                    coleccion.removeAll(coleccion);
                    System.out.println("Todos los vendedores eliminados.");
                    break;
            }

        } while (opciones != 5);

            System.out.println("Programa finalizado.");
        }
    }
