public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;

    // addFirst
    public void addLast(int number) {
        Node node = new Node(number);

        if (first == null)
            first = last = node;
        else
            last.next = node;
        last = node;

    }

    // creat method addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            first.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    // creat indexOf method
    public int indexOf(int item) {
        int index = 0;
        var node = first;

        while (node != null) {
            if (node.value == item)
                return index;
            node = node.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {

        // var node = first;
        // while (node!=null) {
        // if(node.value==item) return true;
        // }
        // return false;
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if (first == last) {
            first = last = null;
            return;
        }

        var node = first;
        while (node != null) {
            node = node.next;
            if (node.next == last) {
                last = node;
                last.next = null;
                return;
            }
        }
    }
}
