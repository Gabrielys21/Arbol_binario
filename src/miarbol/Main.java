package miarbol;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertamos los valores en un orden específico para balancear el árbol
        arbol.insertar(40);
        arbol.insertar(20);
        arbol.insertar(60);
        arbol.insertar(10);
        arbol.insertar(30);
        arbol.insertar(50);
        arbol.insertar(70);

        // Crear la ventana
        JFrame frame = new JFrame("Árbol Binario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Agregar el panel del árbol gráfico (true for circles, false for squares)
        ArbolGrafico arbolGrafico = new ArbolGrafico(arbol, true);
        frame.add(arbolGrafico);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}