public class Stack {
    private Node top; // referência para o topo da pilha

    // casinha
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // void push(T data);
    // se a pilha estiver vazia
    // cria casinha e topo <- casinha
    // senão
    // cria casinha, casinha.next = topo, topo = casinha


    // T pop();
    // não pode ser vazia!!!
    // aux = topo
    // top aponta para aux.next, aux.next <- null
    // retorna aux.valor


    // boolean isEmpty();
    // se o topo for null é vazio

}
