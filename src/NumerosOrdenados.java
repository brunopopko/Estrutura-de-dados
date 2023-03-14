import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células.
Deve-se sempre remover os dados da célula inicial da lista; 
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
Passo 5: Repita os passos 2 e 3. 
Passo 6: Exiba todos os números que foram inseridos na fila. 
 
Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 
 */

public class NumerosOrdenados {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Stack<Integer> pilhaNumeros = new Stack<>();
        Queue<Integer> filaNumeros = new LinkedList<>();
        int i;

        //Inserindo os números [1, 2, 3, 4 e 5] na lista
        for(i = 1; i <= 5; i++) {
            listaNumeros.add(i);
        }

        System.out.println("Número de elementos da lista: " + listaNumeros.size());
        System.out.println("Segue números na lista: ");
        while(!listaNumeros.isEmpty()) {
            //Removendo o próximo número da lista e dando para uma variável temporária
            int elementoLista = listaNumeros.remove(0);
            //Imprimindo o número da lista na ordem
            System.out.printf("%d ", elementoLista);
            //Adicionando o elemento da lista à pilha na ordem
            pilhaNumeros.push(elementoLista);
        }
        
        if(listaNumeros.isEmpty()) {
            System.out.println("\nMinha lista está vazia!");
        } else {
            System.out.println("\nOops, algo deu errado, minha lista deveria estar vazia.");
        }

        System.out.println("Número de elementos da pilha: " + pilhaNumeros.size());

        System.out.println("Segue números na pilha: ");
        while(!pilhaNumeros.isEmpty()) {
            //Removendo o elemento da pilha e dando para uma variável temporária
            int elementoPilha = pilhaNumeros.pop();
            //Imprimindo o número da pilha na ordem
            System.out.printf("%d ", elementoPilha);
            //Adicionando o número da pilha à fila na ordem
            filaNumeros.add(elementoPilha);
        }

        if(pilhaNumeros.isEmpty()) {
            System.out.println("\nMinha pilha está vazia!");
        }else {
            System.out.println("\nOops, algo deu errado, minha pilha deveria estar vazia.");
        }

        //Verificando o número de elementos na fila
        System.out.println("Número de elementos na fila: " + filaNumeros.size());
        System.out.println("Segue números na fila; ");
        for (Integer numeroFila: filaNumeros) {
            System.out.printf("%d ", numeroFila);
        }

        //Repetindo os passos 2 e 3 com os números [6, 7, 8, 9 e 10];
        //Inserindo os números [6, 7, 8, 9 e 10] na lista
        for(i = 6; i <= 10; i++) {
            listaNumeros.add(i);
        }
        System.out.println("\nNúmero de elementos da lista na segunda rodada de inserção: " + listaNumeros.size());
        System.out.println("Segue números na lista após segunda rodada de inserção: ");
        while(!listaNumeros.isEmpty()) {
            //Removendo o próximo elemento da lista e dando para uma variável temporária
            int elementoLista = listaNumeros.remove(0);
            //Imprimindo o número da lista na ordem
            System.out.printf("%d ", elementoLista);
            //Adicionando o elemento da lista à pilha na ordem
            pilhaNumeros.push(elementoLista);
        }

        if(listaNumeros.isEmpty()) {
            System.out.println("\nMinha lista está vazia!");
        } else {
            System.out.println("\nOops, algo deu errado, minha lista deveria estar vazia.");
        }

        System.out.println("Número de elementos da pilha: " + pilhaNumeros.size());
        System.out.println("Segue números na pilha após segunda rodada de inserção: ");
        while(!pilhaNumeros.isEmpty()) {
            //Removendo o elemento da pilha e dando para uma variável temporária
            int elementoPilha = pilhaNumeros.pop();
            //Imprimindo o número da pilha na ordem
            System.out.printf("%d ", elementoPilha);
            //Adicionando o elemento da pilha à fila na ordem
            filaNumeros.add(elementoPilha);
        }

        if(pilhaNumeros.isEmpty()) {
            System.out.println("\nMinha pilha está vazia!");
        } else {
            System.out.println("\nOops, algo deu arrado, minha pilha deveria estar vazia.");
        }

        //Imprimindo tamanho da fila e os elementos da fila
        System.out.println("O tamanho final da minha fila é de: " + filaNumeros.size());
        System.out.println("Segue números ordenados na fila, após todas as inserções: ");
        for (Integer numeroFila : filaNumeros) {
            System.out.printf("%d ", numeroFila);
        }
    }
}
