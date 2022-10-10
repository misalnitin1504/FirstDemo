package MyPractice.myExceptions.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExampleUseThreadClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Thread() {

            @Override
            public void run() {
                System.out.println("ExecutorService");
                try{
                    for(int i=0;i<10;i++){
                        if((i%2)!=0){
                            System.out.print (" "+i);
                            Thread.sleep(1000);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
        executorService.shutdown();
    }
}
