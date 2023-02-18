/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author brian
 */
public class Fila {
    private List<String> alunos = new LinkedList<String>();
    
    //métodos
    public void adiciona(String aluno) {
        alunos.add(aluno);
    }
    
    public String remove() {
        return alunos.remove(0);
    }
    
    public boolean vazia() {
        return alunos.isEmpty();
    }
    
    @Override
    public String toString() {
        return alunos.toString();
}
}

/*
Queue
Da mesma forma que a estrutura de Pilhas tinha o nome de Stack, à estrutura de 
Filas damos o nome de Queue:

Queue<String> filaDoJava = new LinkedList<String>();COPIAR CÓDIGO
Para as filas os métodos têm os seguintes nomes:

adiciona: add
remove: poll
Implementamos da seguinte forma:

Queue<String> filaDoJava = new LinkedList<String>();

filaDoJava.add("Mauricio");
String x2 = filaDoJava.poll();COPIAR CÓDIGO
Se imprimirmos o x2, nos retorna Mauricio.
*/