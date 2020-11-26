public class Queue {
    // ref. primeiro item
    private Node first;
    // ref. último item
    private Node last;

    // item (nó)
    // POJO - Plain old java object
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    // Construtor
    public Queue() {
        first = null;
        last = null;
    }

    // vazia?
    public boolean isEmpty() {
        return (first == null && last == null);
    }

    // enfileirar
    public void enqueue(int data) {
        // criar a casinha
        Node aux = new Node(data);

        // se a fila estiver vazia
        if (isEmpty()) {
            last = aux;
            first = aux;
        } else {
            last.next = aux;
            last = aux;
        }
    }
    // desenfileirar
    public int dequeue() {
        Node aux; // etiqueta auxiliar
        int data; // valor retornado ao usuário

        if (isEmpty()) { // não pode desenfileirar! erro!
            throw new IndexOutOfBoundsException("Fila vazia! Impossível desenfileirar!");
        }

        // se não for vazia
        aux = first;  // etiqueta auxiliar aponta para o primeiro nó
        first = first.next; // primeiro aponta para o segundo
        aux.next = null; // desconecto o auxiliar da fila
        data = aux.data; // obter o valor para retornar

        // se a fila ficou vazia
        if (first == null) {
            last = null; // último também deve apontar para null
        }

        return data;
    }

    // obter o primeiro
    public int getFirst() {
        return first.data;
    }
    // obter o último
    public int getLast() {
        return last.data;
    }
}
