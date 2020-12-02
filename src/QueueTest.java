public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(6);

        try { // tente
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            // Erro! fila vazia
            System.out.println(q.dequeue());
        } catch (IndexOutOfBoundsException ex) { // se pegar ....
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim do programa!");
    }
}
