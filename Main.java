public class Main {

    public static void main(String[] args) {
        int[] masInt = new int[30];
        MyStack masStack = new MyStack(masInt);
        System.out.println("Добавление в Стек");
        masStack.push(7);
        System.out.println(" значение = " + masStack.pick());
        masStack.push(9);
        System.out.println(" значение = " + masStack.pick());
        masStack.push(32);
        System.out.println(" значение = " + masStack.pick());
        masStack.push(23);
        System.out.println(" значение = " + masStack.pick());
        System.out.println("Удаление из стека");
        System.out.println(" значение = " + masStack.pick());
        masStack.pop();
        System.out.println(" значение = " + masStack.pick());
        masStack.pop();
        System.out.println(" значение = " + masStack.pick());
        masStack.pop();
        System.out.println(" значение = " + masStack.pick());
        masStack.pop();
        System.out.println("Удаление из постого стека");
        masStack.pop();
        masStack.pop();

    }

}
