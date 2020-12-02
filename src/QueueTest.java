public class QueueTest {
    public static void main(String[] args) {
        Queue<Aluno> q = new Queue<>();

        q.enqueue(new Aluno(1, "João", 20));
        q.enqueue(new Aluno(2, "José", 20));
        q.enqueue(new Aluno(3, "Julio", 20));
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
