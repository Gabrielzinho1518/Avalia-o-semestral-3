package pacote;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Iterator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double altura;
        String nome;
        String apelido;
        String posição;
        
        TreeSet<Atleta> treeAtleta = new TreeSet<>(Comparator.comparing(Atleta::getAltura));




        System.out.println("Digite algum numero para cadastrar os dados do Atleta de volei de areia que deseja cadastrar:");
        int atletas = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < atletas; i++) {
            System.out.println("Digite os dados do Atleta " + (i + 1) + ":");
            System.out.println("Nome: ");
            String nome1 = teclado.nextLine();
            System.out.println("Altura: ");
            String altura1 = teclado.nextLine();
            System.out.println("Apelido: ");
            String apelido1 = teclado.nextLine();
            System.out.println("Posicao: ");
            String posição1 = teclado.nextLine();
            treeAtleta.add(new Atleta(nome1, altura1, apelido1, posição1));
        }

        List<Atleta> listaOrdenada = treeAtleta.stream()
                .collect(Collectors.toList());

        for (Atleta atleta : listaOrdenada) {
            System.out.println(atleta);
        }
        salvarDados(listaOrdenada, treeAtleta); 
    }

    private static void salvarDados(List<Atleta> listaOrdenada, TreeSet<Atleta> treeAtleta) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("atletas"))) {
            writer.write("Altura,Nome,Apelido,Posicao\n");
            for (Atleta atleta : listaOrdenada) {
                writer.write(atleta.getAltura() + "," + atleta.getNome() + "," + atleta.getApelido() + ","
                        + atleta.getPosição() + "\n");
            }
            Scanner teclado = new Scanner(System.in);
            int op = 0;
            while(op != 2){
                System.out.println("Digite o nome do atleta que deseja remover:");
                String nomeRemover = teclado.nextLine();
                boolean removido = false;
                Iterator<Atleta> iterator = treeAtleta.iterator();
                while (iterator.hasNext()) {
                    Atleta atleta = iterator.next();
                    if (atleta.getNome().equals(nomeRemover)) {
                        iterator.remove();
                        removido = true;
                        break;
                    }
                }

                if (removido) {
                    System.out.println("Atleta removido com sucesso.");
                } else {
                    System.out.println("Atleta não encontrado.");
                }
                
                System.out.println("Deseja continuar removendo atletas? (1 - Sim, 2 - Nao)");
                op = Integer.parseInt(teclado.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo: " + e.getMessage());
        }
        		System.out.println("Programa encerrado!");
    }
}
