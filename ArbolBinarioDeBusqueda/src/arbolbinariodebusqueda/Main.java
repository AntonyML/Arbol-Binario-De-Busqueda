/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariodebusqueda;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author TonyML
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinarioDeBusqueda tree = new ArbolBinarioDeBusqueda();

        Logic l = new Logic();
        // Agrego datos aleatoriamente

     //  l.addRamdonData_ABB(tree, Integer.parseInt(JOptionPane.showInputDialog("Tamano de Arbol")));

        tree.insert(0, "Nombre ", "C14887", "Info");
        tree.insert(1, "Nombre ", "C14887", "Info");
        tree.insert(2, "Nombre ", "C14887", "Info");
        tree.insert(3, "Nombre ", "C14887", "Info");
        System.out.println("Recorrido en orden del arbol de busqueda binaria");
        tree.inorder();
        System.out.println();
        System.out.println(" Recorrido en postorden del arbol de busqueda binaria");
        tree.postorder();
        System.out.println();
        System.out.println(" Recorrido en preorden del arbol de busqueda binaria");
        tree.preorder();
        System.out.println();

        System.out.println(" Recorrido en interfaz del arbol de busqueda binaria");
        tree.printTreeJerarquia();

        System.out.println(" Recorrido en interfaz con el nivel del arbol de busqueda binaria");
        tree.printTree();
    }

}
