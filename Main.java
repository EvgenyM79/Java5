public class Main {

    public static void main(String[] args) {
        MyQueue newQueue = new MyQueue(10);
        System.out.println("Пробуем взять элемент из пустой очереди");
        newQueue.extract();
        newQueue.add(5);
        System.out.println("В очередь добавлен элемент [" + newQueue.getLast() + "]= " + newQueue.getLastElement());
        newQueue.add(2);
        System.out.println("В очередь добавлен элемент [" + newQueue.getLast() + "]= " + newQueue.getLastElement());
        newQueue.add(7);
        System.out.println("В очередь добавлен элемент [" + newQueue.getLast() + "]= " + newQueue.getLastElement());
        newQueue.add(9);
        System.out.println("В очередь добавлен элемент [" + newQueue.getLast() + "]= " + newQueue.getLastElement());
        System.out.println("Из очереди взять элемент [" + newQueue.getFirst() + "]= " + newQueue.getFirstElement());
        newQueue.extract();
        System.out.println("Из очереди взять элемент [" + newQueue.getFirst() + "]= " + newQueue.getFirstElement());
        newQueue.extract();
        System.out.println("Из очереди взять элемент [" + newQueue.getFirst() + "]= " + newQueue.getFirstElement());
        newQueue.extract();
        System.out.println("Из очереди взять элемент [" + newQueue.getFirst() + "]= " + newQueue.getFirstElement());
        newQueue.extract();
        newQueue.extract();
        newQueue.extract();
    }

}