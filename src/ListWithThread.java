import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWithThread {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        ListByThread listByThread = new ListByThread();
        listByThread.start();

        Thread.sleep(100);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed " + (endTime - startTime));
    }

    static class ListByThread extends Thread {
        @Override
        public void run() {
            final int N=1000000;
            List<Integer> list = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                list.add(i);
            }
        }
    }
}