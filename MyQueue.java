public class MyQueue {

    private int lengthMasQueue;
    private int first = -1;
    private int last = -1;
    private int[] masQueue;

    MyQueue(int lengthMasQueue){
        masQueue = new int[this.lengthMasQueue = lengthMasQueue];
    }

    public void add(int value){
        if (last < 0) {
            first = 0;
            last = 0;
            masQueue[0] = value;
        }
        else {
            last ++;
            masQueue[last] = value;
        }
    }

    public int getLast(){
        return last;
    }

    public int getLastElement(){
        return masQueue[last];
    }

    public int getFirst(){
        return first;
    }

    public int getFirstElement(){
        return masQueue[first];
    }


    public void extract(){
        if (first < 0 || last < 0) {
            System.out.println("Очередь пустая");
        }
        else if (!isEmpty()){
            first ++;
        }
        else System.out.println("Очередь пустая");
    }

    public boolean isEmpty() {
        return (first == last);
    }

}