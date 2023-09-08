import java.util.Comparator;

/**
 * Связный список
 * @param <T>
 */
public class LinkedList<T> {

    /**
     * Ссылка на первый элемент связного списка
     */
    private Node head;

    /**
     * Узел
     */
    class Node{

        /**
         * Ссылка на следующий элемент связного списка
         */
        public Node next;

        /**
         * Значение
         */
        public T value;

    }

    /**
     * Добавление нового элемента в начало связного списка
     * @param value значение
     */
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    /**
     * Удалить первый элемент связного списка
     */
    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public T contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    /**
     * Сортировка (выбором)
     */
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){

            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }

    /**
     * Добавление значения в конец связного списка
     * @param value значение
     */
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /**
     * Удаление элемента из конца связного списка
     */
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }

    /**
     * Удаление элемента по индексу
     * @param index индекс элемента, который нужно удалить
     * @return удаленное значение элемента или null, если индекс выходит за пределы списка
     */
    public T remove(int index) {
        if (head == null || index < 0) {
            return null;
        }

        if (index == 0) {
            T removedValue = head.value;
            head = head.next;
            return removedValue;
        }

        Node previous = head;
        Node current = head.next;
        int currentIndex = 1;

        while (current != null && currentIndex < index) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            T removedValue = current.value;
            previous.next = current.next;
            return removedValue;
        }
        return null;
    }
    /**
     * Удаление элемента из связного списка по значению
     * @param value значение, которое нужно удалить
     * @return true, если элемент был найден и удален, в противном случае - false
     */
    public boolean remove(T value) {
        if (head == null) {
            return false;
        }

        if (head.value.equals(value)) {
            head = head.next;
            return true;
        }

        Node previous = head;
        Node current = head.next;

        while (current != null) {
            if (current.value.equals(value)) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    /**
     * Разворот связанного списка
     */
    public void reverse(){
        Node previous = null;
        Node current = head;

        while (current != null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        head = previous;
    }
    /**
     * Получение длины (количества элементов) связного списка
     * @return количество элементов в списке
     */
    public int size() {
        int count = 0;
        Node node = head;

        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }
    /**
     * Получение элемента по индексу
     * @param index индекс элемента, который нужно получить
     * @return элемент списка по указанному индексу или null, если индекс выходит за пределы списка
     */
    public T get(int index) {
        if (index < 0) {
            // Передан некорректный индекс
            return null;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            // Нашли элемент по индексу
            return current.value;
        }

        // Индекс выходит за пределы списка
        return null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}