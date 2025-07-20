/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud;
import java.util.Scanner;

public class MenuModulos {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("\nSeleccione un módulo:");
                System.out.println("1. Facturación");
                System.out.println("2. Desarrollo");
                System.out.println("3. Financiera");
                System.out.println("4. Servicio al Cliente");
                System.out.println("5. Comercial");
                System.out.println("6. Contadores");
                System.out.println("7. Salir");
                System.out.print("Opción: ");
                
                int opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1 -> System.out.println("🔐 Módulo de Facturación abierto...");
                    case 2 -> System.out.println("💻 Módulo de Desarrollo abierto...");
                    case 3 -> System.out.println("💰 Módulo Financiera abierto...");
                    case 4 -> System.out.println("📞 Módulo de Servicio al Cliente abierto...");
                    case 5 -> System.out.println("📈 Módulo Comercial abierto...");
                    case 6 -> System.out.println("📊 Módulo de Contadores abierto...");
                    case 7 -> {
                        System.out.println("👋 Saliendo del sistema...");
                        continuar = false;
                    }
                    default -> System.out.println("❗ Opción no válida. Intenta de nuevo.");
                }
            }
        }
    }
}
