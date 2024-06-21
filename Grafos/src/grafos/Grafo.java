package grafos;

import java.util.ArrayList;
import java.util.Collections;

public class Grafo {
    private ArrayList<String> vertices;
    private int[][] matrizAdjacencia;
    private int numVertices;

    public Grafo(ArrayList<String> vertices) {
        this.vertices = new ArrayList<>(vertices);
        this.numVertices = vertices.size();
        this.matrizAdjacencia = new int[numVertices][numVertices];
    }

    public void inserirArestaSimetrica(String vertice1, String vertice2) {
        int index1 = vertices.indexOf(vertice1);
        int index2 = vertices.indexOf(vertice2);
        if (index1 != -1 && index2 != -1) {
            matrizAdjacencia[index1][index2] = 1;
            matrizAdjacencia[index2][index1] = 1; // Grafo não direcionado (simétrico)
        }
    }

    public void show() {
        System.out.println("Matriz de Adjacência:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int mostrarGrau(String vertice) {
        int index = vertices.indexOf(vertice);
        if (index != -1) {
            int grau = 0;
            for (int i = 0; i < numVertices; i++) {
                grau += matrizAdjacencia[index][i];
            }
            return grau;
        }
        return -1; // Retorna -1 se o vértice não for encontrado
    }

    public ArrayList<String> getVertices() {
        return vertices;
    }

    public int[][] getMatrizAdjacencia() {
        return matrizAdjacencia;
    }
}
