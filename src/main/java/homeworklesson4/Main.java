package homeworklesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        firstMethod();
        secondMethod();
    }

    private static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * (Math.cos(0.2f) + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - a) + " ms.");
    }


    private static void secondMethod() throws InterruptedException {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();

        float[] leftHalf = new float[size/2];
        float[] rightHalf = new float[size/2];
        System.arraycopy(arr, 0, leftHalf, 0, size/2);
        System.arraycopy(arr, size/2, rightHalf, 0,size/2);
        long b = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = (float)(leftHalf[i] * Math.sin(0.2f + i / 5) * (Math.cos(0.2f) + i / 5) * Math.cos(0.4f + i / 2));
            }
            long half1 = System.currentTimeMillis();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < rightHalf.length; i++) {
                rightHalf[i] = (float)(rightHalf[i] * Math.sin(0.2f + i / 5) * (Math.cos(0.2f) + i / 5) * Math.cos(0.4f + i / 2));
            }
            long half2 = System.currentTimeMillis();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        float[] bothHalfArr = new float[size];
        System.arraycopy(leftHalf, 0, bothHalfArr, 0,size/2);
        System.arraycopy(rightHalf, 0, bothHalfArr, size/2, size/2);

        System.out.println("Two thread time: " + (System.currentTimeMillis() - a) + " ms.");
    }
}
