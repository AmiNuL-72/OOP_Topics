/* Problem: Implement a simple multi-threaded program that prints numbers from 1 to 10 using two threads.

---------------------------------------------
[code]:
class PrintNumbers extends Thread {
    private int start;
    private int end;

    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintNumbers thread1 = new PrintNumbers(1, 5);
        PrintNumbers thread2 = new PrintNumbers(6, 10);

        thread1.start();
        thread2.start();
    }
}
