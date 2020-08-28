package homework9.task28;

public class Array<E> {
    private E[] array;

    public Array(E[] array) {
        this.array = array;
    }

    public E get(int index) {
        return array[index];
    }
}
