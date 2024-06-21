package grafos;

import java.util.ArrayList;
import java.util.Collections;

public class Principa {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("Sao Pedro");
        cidades.add("Santa Maria");
        cidades.add("Agudo");
        cidades.add("Santa Cruz");
        cidades.add("Itaara");
        cidades.add("Sao Martinho");
        cidades.add("Julio de Castilhos");
        cidades.add("Cruz Alta");
        cidades.add("Soledade");
        cidades.add("Lajeado");
        cidades.add("Porto Alegre");

        // Ordena a lista de cidades
        Collections.sort(cidades);

        // Cria um grafo com as cidades
        Grafo grafo_rs = new Grafo(cidades);

        // Insere as arestas
        grafo_rs.inserirArestaSimetrica("Sao Pedro", "Santa Maria");
        grafo_rs.inserirArestaSimetrica("Santa Maria", "Agudo");
        grafo_rs.inserirArestaSimetrica("Agudo", "Santa Cruz");
        grafo_rs.inserirArestaSimetrica("Santa Cruz", "Porto Alegre");
        grafo_rs.inserirArestaSimetrica("Porto Alegre", "Lajeado");
        grafo_rs.inserirArestaSimetrica("Lajeado", "Soledade");
        grafo_rs.inserirArestaSimetrica("Soledade", "Cruz Alta");
        grafo_rs.inserirArestaSimetrica("Cruz Alta", "Julio de Castilhos");
        grafo_rs.inserirArestaSimetrica("Julio de Castilhos", "Itaara");
        grafo_rs.inserirArestaSimetrica("Itaara", "Sao Martinho");
        grafo_rs.inserirArestaSimetrica("Itaara", "Santa Maria");

        // Mostra o grafo
        grafo_rs.show();

        // Exemplo de cálculo do grau de um vértice
        String cidade = "Itaara";
        System.out.println("Grau da cidade de " + cidade + ": " + grafo_rs.mostrarGrau(cidade));
        
        
    }
}
