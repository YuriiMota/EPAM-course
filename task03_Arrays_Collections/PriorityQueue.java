package epam.SimpleTasks;

import epam.droids.Droid;

import java.util.Comparator;

public class PriorityQueue<T extends Droid> {
    private int size;

    ///inner class (типу вузол)
    private class NodeT implements Cloneable{
        private T data;
        private NodeT next;
        private NodeT prev;

        public NodeT(T data){
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }

    }
    private NodeT first = null;

    public boolean isEmpty(){
        return first == null;
    }
    //add element to PriorityQueue
    public void push(T data){
        size++;
        NodeT node = new NodeT(data);
        NodeT firstSave = this.first;
        if(first == null){
            first = node;
            return;
        }
        while(first != null){
            if(first.data.compareTo(node.data) >= 0){
                if(first.prev == null){
                    first.prev = node;
                    node.next = first;
                    this.first = node;
                    break;
                }
                else{
                    first.prev.next = node;
                    node.prev = first.prev;
                    node.next = first;
                    first.prev = node;
                    this.first = firstSave;
                    break;
                }
            }
            else{
                if(first.next != null){
                    first = first.next;
                }
                else{
                    first.next = node;
                    node.prev = first;
                    this.first = firstSave;
                    break;
                }
            }

        }

    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        NodeT node = first;
        first = first.next;
        size--;
        return node.data;
    }
    public T peek(){
        return first.data;
    }
    public void clear(){
        this.first = null;

    }

    @Override
    public String toString() {
        System.out.print("Our warriors! : ");
        StringBuilder listBuilder = new StringBuilder();
        NodeT currentNode = first;
        while (currentNode != null) {
            listBuilder.append(currentNode.data).append(",");
            currentNode = currentNode.next;
        }

        return "[ "+listBuilder.toString()  + "]";
    }

    public int size(){
        return size;
    }
}
