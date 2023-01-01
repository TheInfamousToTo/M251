package Week13;

public class MyFisrtRannable implements Runnable{
    private int mylabel;
    public MyFisrtRannable(int label) {
        mylabel = label;
    }
    public int getmylabel() {
        return mylabel;
    }
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(i+ " - Thread " + mylabel + " is running");
        }
    }

    public static void main(String[] args) {
        MyFisrtRannable t1 = new MyFisrtRannable(1);
        MyFisrtRannable t2 = new MyFisrtRannable(2);
        MyFisrtRannable t3 = new MyFisrtRannable(3);
        MyFisrtRannable t4 = new MyFisrtRannable(4);
        MyFisrtRannable t5 = new MyFisrtRannable(5);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);
        Thread thread5 = new Thread(t5);


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

