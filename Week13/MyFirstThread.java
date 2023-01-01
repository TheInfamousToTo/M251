package Week13;

public class MyFirstThread extends Thread {
    private int mylabel;
    public MyFirstThread(int label) {
        mylabel = label;
    }
    public int getmylabel() {
        return mylabel;
    }
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i+ " - Thread " + mylabel + " is running");
        }
    }

    public static void main(String[] args) {
        MyFirstThread t1 = new MyFirstThread(1);
        MyFirstThread t2 = new MyFirstThread(2);
        MyFirstThread t3 = new MyFirstThread(3);
        MyFirstThread t4 = new MyFirstThread(4);
        MyFirstThread t5 = new MyFirstThread(5);


        // start the threads simultaneously
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
        //start the threads one after another
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
    }
}

