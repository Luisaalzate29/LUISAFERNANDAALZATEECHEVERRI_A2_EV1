/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectosena;


import java.io.*;
import java.util.*;

public class SistemaUsuarios {
    static final String archivoUsuarios = "usuarios.txt";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Iniciar sesión\n2. Recuperar contraseña\n3. Registrar usuario");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar entrada

        switch (opcion) {
            case 1 -> login(sc);
            case 2 -> recuperarContraseña(sc);
            case 3 -> registrarUsuario(sc);
            default -> System.out.println("Opción no válida");
        }
    }

    static void login(Scanner sc) throws IOException {
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Clave: ");
        String clave = sc.nextLine();

        boolean acceso;
        try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {
            String linea;
            acceso = false;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(usuario) && datos[1].equals(clave)) {
                    acceso = true;
                    break;
                }
            }
        }
        System.out.println(acceso ? "¡Acceso permitido!" : "Usuario o clave incorrectos.");
    }

    static void recuperarContraseña(Scanner sc) throws IOException {
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        boolean encontrado;
        try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {
            String linea;
            encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(usuario)) {
                    System.out.println("Tu clave es: " + datos[1]);
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) System.out.println("Usuario no encontrado.");
    }

    static void registrarUsuario(Scanner sc) throws IOException {
        System.out.print("Nuevo usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Nueva clave: ");
        String clave = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoUsuarios, true))) {
            bw.write(usuario + "," + clave);
            bw.newLine();
        }
        System.out.println("Usuario registrado exitosamente.");
    }
}
