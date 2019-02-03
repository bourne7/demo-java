package ThreadPool;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        // 注意，这里如果使用ExecutorService接口的话，会导致返回的对象失去部分方法，所以最好还是强制转化一下，这里的
        // 前置转化肯定是不会报错的。
        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));

        for (int i = 0; i < 10; i++) {
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
                    executor.getQueue().size() + "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());
            sleep(100L);
        }


        executor.shutdown();
    }

    private static void sleep(long time) {
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
