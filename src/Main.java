import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Cliente> lista = new ArrayList<>();

        int opc=10;
        while(opc!=0){
            System.out.println("-----------------MENU CLIENTES----------------");
            System.out.println("1) Agregar cliente");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Buscar cliente por ID");
            System.out.println("4) Eliminar cliente");
            System.out.println("0) Cerrar sistema");
            System.out.print("Elige una opción: ");
            opc= sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("----------AGREGAR CLIENTE--------------");
                    Cliente cliente = new Cliente();
                    try {
                        System.out.print("Ingresa el ID del cliente: ");
                        cliente.setId(sc.nextInt());
                        System.out.print("Ingresa el Nombre del cliente: ");
                        cliente.setNombre(bf.readLine());
                        System.out.print("Ingresa la Edad del cliente: ");
                        cliente.setEdad(bf.readLine());
                        System.out.print("Ingresa el Correo del cliente: ");
                        cliente.setCorreo(bf.readLine());
                        System.out.print("Ingresa el Telefono del cliente: ");
                        cliente.setTelefono(bf.readLine());
                        lista.add(cliente);
                    }catch (Exception e){
                        System.out.println("Valor no valido, vuelve a intentarlo");
                    }

                    break;
                case 2:
                    System.out.println("--------------------MOSTRAR CLIENTE'S------------------------");
                   for(Cliente x:lista){
                       System.out.println("-----------------------------------------------------");
                       System.out.println("ID: " + x.getId());
                       System.out.println("Nombre: " + x.getNombre());
                       System.out.println("Edad: " + x.getEdad());
                       System.out.println("Correo: " + x.getCorreo());
                       System.out.println("Telefono: " + x.getTelefono());
                   }

                    break;
                case 3:
                    System.out.println("-------------Bucar Cliente------------------");
                    System.out.print("Ingresa el ID del cliente: ");
                    int codig = sc.nextInt();
                    for(Cliente x:lista){
                        if(codig == x.getId()){
                            System.out.println("ID: " + x.getId());
                            System.out.println("Nombre: " + x.getNombre());
                            System.out.println("Edad: " + x.getEdad());
                            System.out.println("Correo: " + x.getCorreo());
                            System.out.println("Telefono: " + x.getTelefono());
                        }
                    }
                    break;
                case 4:
                    System.out.println("-------------Eliminar Cliente-----------------");
                    System.out.print("Ingresa el ID del cliente que deceas eliminar: ");
                    int elim = sc.nextInt();
                    for(Cliente x:lista){
                        if(elim == x.getId()){
                        lista.remove(x);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Sistema cerrado");
                    break;
            }
        }
    }
}
