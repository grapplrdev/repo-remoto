import java.util.Scanner;
public class holaGit {
  public static void main(String[] args) {
    Scanner lector = new  Scanner(System.in);
    String nombre;
    System.out.println("Ingresa tu nombre");
    nombre = lector.nextLine();
    
    System.out.println("Hola "+nombre);
  }
}
