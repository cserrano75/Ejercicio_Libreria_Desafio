package com.aluracursos.desafio_literatura.principal;

import com.aluracursos.desafio_literatura.model.Datos;
import com.aluracursos.desafio_literatura.model.DatosLibros;
import com.aluracursos.desafio_literatura.service.ConsumoAPI;
import com.aluracursos.desafio_literatura.service.ConvierteDatos;

import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraElMenu() {

        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libros 
                    2 - Buscar autor
                    3 - Mostrar libros buscados
                    4 - Buscar libro por titulo
                    5 - Top 5 mayores descargas
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Opcion 5");
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

//        var json = consumoAPI.obtenerDatos("https://gutendex.com/books/");
//        System.out.println(json);
//
//        var datos = conversor.obtenerDatos(json, Datos.class);
//        System.out.println(datos);
    }
}
