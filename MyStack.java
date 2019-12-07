import sun.invoke.empty.Empty;

public class MyStack {

    private int[] masStack;
    private int nElement = -1;

    public MyStack(int[] masStack){
        this.masStack = masStack;
        nElement = -1;
    }

    public boolean isEmpty(){
        return nElement > -1;
    }

    public void push(int element){
        nElement ++;
        masStack[nElement] = element;
    }

    public int pop(){
        if (isEmpty()) {
            return masStack[nElement--];
        }
        else {
            System.out.println("Стек пустой");
            return 0;
        }
    }

    public int pick(){
        if (isEmpty()) {
            return masStack[nElement];
        }
        else {
            System.out.println("Стек пустой");
            return 0;
        }
    }
}
