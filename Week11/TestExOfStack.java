package Week11;

public class TestExOfStack {
    public static void main(String[] args) {
        ExOfStack ex1=new ExOfStack();
        ex1.push(3);
        ex1.push(6);
        ex1.push(4);
        ex1.push(8);
        ex1.push(9);
        ex1.push(7);
        ex1.push(2);
        ex1.push(6);
        System.out.println("Number Of Elements in the stack is : "+ex1.getSize());
        System.out.println(ex1.pop());
        //System.out.println(ex1.pop());
        System.out.println(ex1.pop());
        System.out.println(ex1.pop());
        System.out.println("Number Of Elements in the stack is : "+ex1.getSize());
        System.out.println(ex1.pop());
        System.out.println(ex1.pop());
        System.out.println(ex1.pop());
        System.out.println("Number Of Elements in the stack is : "+ex1.getSize());
        System.out.println("is the stack Empty : "+ex1.isEmpty());
        System.out.println(ex1.pop());
        System.out.println(ex1.pop());
        System.out.println("Number Of Elements in the stack is : "+ex1.getSize());
        System.out.println("is the stack Empty : "+ex1.isEmpty());
        //System.out.println(ex1.pop());
        System.out.println("Number Of Elements in the stack is : "+ex1.getSize());
        System.out.println(ex1.pop());
        System.out.println(ex1.pop());


    }





}
