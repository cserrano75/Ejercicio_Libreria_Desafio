package com.aluracursos.desafio_literatura.principal;

import com.aluracursos.desafio_literatura.model.Datos;
import com.aluracursos.desafio_literatura.model.DatosLibros;
import com.aluracursos.desafio_literatura.repository.DatosRepository;
import com.aluracursos.desafio_literatura.service.ConsumoAPI;
import com.aluracursos.desafio_literatura.service.ConvierteDatos;

import java.util.*;

public class Principal {
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);
    private DatosRepository repositorio;
    private List<DatosLibros> datosLibros = new ArrayList<>();

    public void muestraElMenu() {

        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libro por titulo
                    2 - Mostrar libros registrados
                    3 - Mostrar autores registrados
                    4 - Mostrar autores vivos en un determinado año
                    5 - Mostrar libros por idioma
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1");
                    buscarLibroPorNombre();
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

    }

    private DatosLibros getDatosLibros() {

            System.out.println("Escribe el nombre de la serie que deseas buscar");
            var nombreLibro = teclado.nextLine();

            // Obtener los datos de la API
            var json = consumoAPI.obtenerDatos("https://gutendex.com/books?search=" + nombreLibro.replace(" ", "+"));

            DatosLibros datos = conversor.obtenerDatos(json, DatosLibros.class);
            return datos;
    }

    private void buscarLibroPorNombre() {

//        DatosLibros datos = getDatosLibros();
//        datosLibros.add(datos);
//        System.out.println(datos);

//        Datos datos = new Datos(datosLibros);
//        repositorio.save(datos);
//        System.out.println(datos);
    }
}
