import java.util.ArrayList;
import java.util.Scanner;
public class Empleado
{
   private String nombreEmpleado;
   private String departamento;
   private String posicion;
   private int salario;
   
   public Empleado(String nombreEmpleado, String departamento, String posicion, int salario)
   {
       this.nombreEmpleado = nombreEmpleado;
       this.departamento = departamento;
       this.posicion = posicion;
       this.salario = salario;
   }
  
   public String obtenerNombreEmpleado()
   {
       return this.nombreEmpleado;
   }
   
   public String obtenerDepartamento()
   {
       return this.departamento;
   }
   
   public String obtenerPosicion()
   {
       return this.posicion;
   }
   
   public int obtenerSalario()
   {
       return this.salario;
   }
   
   public void verDepartamento()
   {
       System.out.println("-Nombre: " +nombreEmpleado);
       System.out.println("-Posición: " +posicion);
       System.out.println("-Salario: $"+salario);
   }
   
   public void verPosicion()
   {
       System.out.println("-Nombre: " +nombreEmpleado);
       System.out.println("-Departamento: " +departamento);
       System.out.println("-Salario: $"+salario);
   }
   
   public static void mostrarEmpleadosDepartamentos (ArrayList<Empleado> bd){
       String departamento;
       Empleado empleado;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Seleccione el departamento del que quiere ver la candidad de empleados.");
       departamento = entrada.nextLine();
       for(Empleado nuevoEmpleado : bd)
       {
           if (nuevoEmpleado.obtenerDepartamento().equals(departamento))
           {
               nuevoEmpleado.verDepartamento();
            }
       }
   }
   
   public static void mostrarEmpleadosPosicion(ArrayList<Empleado> bd){
       String posicion;
       Empleado empleado;
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Seleccione la posición de la que quiere ver la candidad de empleados.");
       posicion = entrada.nextLine();
       for(Empleado nuevoEmpleado : bd)
       {
           if (nuevoEmpleado.obtenerPosicion().equals(posicion))
           {
               nuevoEmpleado.verPosicion();
            }
       }
   }
   
   public static void main (String[] args)
   {
       ArrayList<Empleado> nuevoEmpleadoSuperMercado = new ArrayList<>();
       Scanner entrada = new Scanner(System.in);
       int opcion;
       String nombreEmpleado;
       String departamento;
       String posicion;
       int salario;
       Empleado nuevoEmpleado;
       int cantidadEmpleados;
       
        do{
           System.out.println("Menu de opciones");
           System.out.println("1. Agregue un empleado a la base de datos de la empresa.");
           System.out.println("2. Ver información de empleados por Departamento.");
           System.out.println("3. Ver información de empleados por Posición.");
           System.out.println("4. Cantidad de empleados de la empresa");
           System.out.println("0. Salir.");
           opcion = entrada.nextInt(); 
           
           switch (opcion){
               case 1:
               entrada.nextLine();
               System.out.println("Ingrese el nombre del empleado.");
               nombreEmpleado = entrada.nextLine();
               System.out.println("Ingrese el departamento: Juridica, Comercial, Administrativo, Ventas, Servicio al cliente.");
               departamento = entrada.nextLine();
               System.out.println("Ingrese la posición: Auxiliar, Ejecutivo, Asistente, Cajero, Empacador.");
               posicion = entrada.nextLine();
               System.out.println("Ingrese el salario.");
               salario = entrada.nextInt();
               
               nuevoEmpleado = new Empleado(nombreEmpleado, departamento, posicion, salario);
               nuevoEmpleadoSuperMercado.add(nuevoEmpleado);
               
               break;
               
               case 2:
               mostrarEmpleadosDepartamentos(nuevoEmpleadoSuperMercado);
               break;
               
                case 3:
               mostrarEmpleadosPosicion(nuevoEmpleadoSuperMercado);
               break;
               
               case 4:
               cantidadEmpleados = nuevoEmpleadoSuperMercado.size();
               System.out.println("El numero de empleados de la empresa es: "+cantidadEmpleados+ " empleados");
           }
        }while (opcion != 0);
   }
}
