package com.prominentpixel.threading;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class Demo05_01OddEvenUsingExecutorServiceCallableTask {
    public static void main(String[] args) throws InterruptedException, ExecutionException, ExecutionException {
             ExecutorService executorService = Executors.newSingleThreadExecutor();

            Set<Callable<String>> callables = new HashSet<Callable<String>>();

            callables.add(new Callable<String>() {
                public String call() throws Exception {
                    System.out.println();

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
                    return "Task 1 Completed";
                }
            });
            callables.add(new Callable<String>() {
                public String call() throws Exception {
                    System.out.println();
                    try{
                        for(int i=0;i<10;i++){
                            if((i%2)==0){

                                System.out.print (" "+i);
                                   Thread.sleep(1000);
                            }
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    return "Task 2 Completed";
                }
            });


            java.util.List<Future<String>> futures = executorService.invokeAll(callables);

            for(Future<String> future : futures){
                System.out.println("\nfuture.get = " + future.get());
            }

            executorService.shutdown();

        }
    }


