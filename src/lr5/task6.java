package lr5;
import java.util.concurrent.*;
import java.util.concurrent.ExecutionException;

public class task6 {

    public static class ArraySum {

        private int[] array;
        private int numThreads;

        public ArraySum(int[] arr) {
            array = arr;
            numThreads = Runtime.getRuntime().availableProcessors();
        }

        public int sum() throws InterruptedException, ExecutionException {
            ExecutorService service = Executors.newFixedThreadPool(numThreads);
            int size = array.length / numThreads;

            CompletionService<Integer> completionService = new ExecutorCompletionService<>(service);
            for (int i = 0; i < numThreads; i++) {
                final int startIndex = i * size;
                final int endIndex = (i == numThreads - 1) ? array.length : startIndex + size;
                completionService.submit(() -> {
                    int sum = 0;
                    for (int j = startIndex; j < endIndex; j++) {
                        sum += array[j];
                    }
                    return sum;
                });
            }

            int sum = 0;
            for (int i = 0; i < numThreads; i++) {
                sum += completionService.take().get();
            }

            service.shutdown();
            return sum;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArraySum arraySummation = new ArraySum(array);
        try {
            int sum = arraySummation.sum();
            System.out.println("Sum of array: " + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
