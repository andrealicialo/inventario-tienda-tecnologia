import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        // Crear la matriz para el inventario de la tienda
        // Cada fila representa un producto: [nombre, precio, cantidad]
        String[][] inventario = {
            {"Laptop", "1500", "10"},
            {"Smartphone", "800", "20"},
            {"Tablet", "300", "15"},
            {"Auriculares", "150", "50"},
            {"Teclado", "80", "30"}
        };

        // Mostrar el inventario
        System.out.println("Inventario de la tienda:");
        System.out.println("Producto\t\tPrecio\tCantidad");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i][0] + "\t\t" + inventario[i][1] + "\t" + inventario[i][2]);
        }

        // Calcular el valor total del inventario
        double totalInventario = 0;
        for (int i = 0; i < inventario.length; i++) {
            double precio = Double.parseDouble(inventario[i][1]);
            int cantidad = Integer.parseInt(inventario[i][2]);
            totalInventario += precio * cantidad;
        }
        System.out.println("\nValor total del inventario: $" + totalInventario);

        // Permitir al usuario buscar un producto por nombre
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del producto que desea buscar:");
        String busqueda = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i][0].equalsIgnoreCase(busqueda)) {
                System.out.println("\nProducto encontrado:");
                System.out.println("Nombre: " + inventario[i][0]);
                System.out.println("Precio: $" + inventario[i][1]);
                System.out.println("Cantidad en stock: " + inventario[i][2]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nProducto no encontrado en el inventario.");
        }
    }
}