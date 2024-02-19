public class ListaCircular{
    public No head;

    public ListaCircular() {
        head = null;
    }  

    // Método para adicionar um nó no início da lista
    public void addFirst(Integer value) {
        No novoNo = new No(value);
        if (head == null) {
            head = novoNo;
            novoNo.next = head;
        } else {
            No aux = head;
            while (aux.next != head) {
                aux = aux.next;
            }
            aux.next = novoNo;
            novoNo.next = head;
        }
        
    }

    // metodo que adciona no final da lista
    public void addLast(Integer value){ 
        No novoNo = new No(value);
        if (head == null) { 
            head = novoNo;
            novoNo.next = head;
        } else {
            No aux = head; 
            while (aux.next != head) {
                aux = aux.next;
            }
            aux.next = novoNo;
            novoNo.next = head;
        }
    }

}
