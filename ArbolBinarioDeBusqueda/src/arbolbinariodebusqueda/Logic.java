/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariodebusqueda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author TonyML
 */
public class Logic {
    //estudiantes Ramdon

    public ArbolBinarioDeBusqueda addRamdonData_ABB(ArbolBinarioDeBusqueda aB, int tamano) {

        List<String> nombres = Arrays.asList("María González", "José Rodríguez", "Luis Pérez", "Ana Sánchez", "Carlos Ramírez", "Juan Jiménez", "Jorge Chavarría", "Víctor Castro", "Gerardo Quesada", "Rafael Vargas", "Mario Mora", "Óscar Fernández", "Manuel Rivera", "Carmen Morales", "Miguel Gutiérrez", "Francisco Solano", "Rosa Chaves", "Marco Vargas", "Laura Herrera", "Marta Rojas", "Flor Brenes", "Ronald Arias", "Álvaro Mora", "Alexander Castro", "Xinia Castro", "William Jiménez", "Andrea Gómez", "Marvin Araya", "Adriana Quesada", "Eduardo Navarro", "Olga Chacón", "Karla Mora", "Elizabeth Rojas", "David Jiménez", "Daniel Mora", "Jonathan Soto", "Karen Cordero", "Silvia Solís", "Sandra Castro", "Sonia Morales", "Ricardo Méndez", "Katherine Chaves", "Kattia Solano", "Luz Sánchez", "Édgar Castro", "Edwin Jiménez", "Mauricio Ramírez", "Fernando Rojas", "Esteban Herrera", "Javier Solís", "Michael Castro", "Jesús Jiménez", "Roberto Mora", "Walter Soto", "Andrés Chaves", "Diego Sánchez", "Alejandro Jiménez", "Sergio Morales", "Guillermo Vargas", "Jessica Castro", "Julio Rodríguez", "Randall Chavarría", "Evelyn Rojas", "Adrián Mora", "Henry Soto", "Pablo Mora", "Shirley Castro", "Johnny Solano", "Christian Soto", "Gustavo Ramírez", "Alejandra Rojas", "Rodrigo Mora", "Carolina Herrera", "Roger Chavarría", "Rodolfo Sánchez", "Margarita Castro", "Freddy Mora", "Ligia Soto", "Marcos Vargas", "Allan Jiménez", "Roxana Rojas", "Virginia Chavarría", "Gabriela Mora", "Maritza Castro", "Patricia Solís", "Erick Jiménez", "Blanca Chaves", "Isabel Sánchez", "Diana Castro", "Wendy Morales", "Greivin Chavarría", "César Ramírez", "Pedro Mora", "Marjorie Rojas", "Cindy Castro", "Karol Soto", "Roy Chaves", "Jenny Solano", "Cristian Mora", "Tatiana Castro");

        List<String> carreras = Arrays.asList("Informática Empresarial", "Enseñanza del Castellano y la Literatura", "Enseñanza de la matematica", "Turismo", "Dirección de Empresas ", "Enseñanza del Ingles"); // Lista de carreras predefinidas

        Random random = new Random();

        int id = 1;
        while (aB.getSize() < tamano) {
            String nombre = nombres.get(random.nextInt(nombres.size()));
            boolean estado = random.nextBoolean();
            String carrera = carreras.get(random.nextInt(carreras.size()));

            String carnet = getRandomLetter() + random.nextInt(1) + 10000 + ".";
            Estudiante e = new Estudiante(nombre, carnet, carrera);
            aB.insert(random.nextInt(100), e.name, e.carnet, e.carrera);
            id++;
        }

        return aB;

    }

    public static char getRandomLetter() {
        Random random = new Random();
        char letter = (char) (random.nextInt(26) + 'a');
        return letter;
    }
}

