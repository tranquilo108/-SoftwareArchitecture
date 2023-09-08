public class MyList<E> {
        private Object[] elements;
        private int size;

        public MyList() {
            elements = new Object[10];
            size = 0;
        }

        public int size() {
            return size;
        }

        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return (E) elements[index];
        }
        public boolean add(E element) {
            if (size == elements.length) {
                Object[] newElements = new Object[size * 2];
                System.arraycopy(elements, 0, newElements, 0, size);
                elements = newElements;
            }
            elements[size++] = element;
            return true;
        }

        public boolean remove(Object o) {
            if (o == null) {
                for (int i = 0; i < size; i++) {
                    if (elements[i] == null) {
                        removeElementAtIndex(i);
                        return true;
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    if (o.equals(elements[i])) {
                        removeElementAtIndex(i);
                        return true;
                    }
                }
            }
            return false;
        }

        private void removeElementAtIndex(int index) {
            int numMoved = size - index - 1;
            if (numMoved > 0) {
                System.arraycopy(elements, index + 1, elements, index, numMoved);
            }
            elements[--size] = null;
        }
    }