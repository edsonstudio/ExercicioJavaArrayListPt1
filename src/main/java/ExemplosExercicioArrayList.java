import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemplosExercicioArrayList {

    public static void main(String[] args) {

    //Crie uma lista e execute as seguintes operações:
        List<String> nomes = new ArrayList<>();

    //Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João;
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println("Adicionando 5 nomes: Juliana, Pedro, Carlos, Larissa e João: ");
        System.out.println(nomes);

    //Navegue na lista exibindo cada nome no console;
        System.out.println("Navegando na lista exibindo cada nome no console:");
        for (String navegarLista : nomes) {
            System.out.println(navegarLista);
        }

    //Substitua o nome Carlos por Roberto;
        nomes.set(2, "Roberto");
        System.out.println("Substituído o nome Carlos por Roberto: " + nomes);

    //Retorne o nome da posição 1;
        System.out.println("Nome da posição 1: " + nomes.get(1));

    //Remova o nome da posição 4;
        nomes.remove(4);
        System.out.println("Removido o nome da posição 4: " + nomes);

    //Retorne a quantidade de itens na lista;
        System.out.println("Retornando a quantidade de itens na lista: " + nomes.size());

    //Verifique se o nome Juliano existe na lista;
        System.out.println("Verificando se o nome Juliano existe na lista: " + nomes.contains("Juliano"));

    //Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista criada.
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        nomes.addAll(nomes2);
        System.out.println("Criada uma nova lista com os nomes: Ismael e Rodrigo e " +
                "adicionados todos os itens da nova lista na primeira lista criada.:\n" + nomes);

    //Ordene os itens da lista por ordem alfabética;
        Collections.sort(nomes);
        System.out.println("Ordenando os itens da lista por ordem alfabética: " + nomes);

    //Verifique se a lista está vazia.
        System.out.println("Verificando se a lista está vazia: " + nomes.isEmpty());
    }
}
