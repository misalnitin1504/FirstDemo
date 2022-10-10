package com.prominentpixel.threading;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class Demo05_02OddEvenUsingExecutorServiceCallableTask {
    public static void main(String[] args) throws InterruptedException, ExecutionException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                GFG g=new GFG();
                new Thread(){
                    @Override
                    public void run() {
                         g.printOddNumber();
                    }
                }.start();
                //t.printOddNumber();
                new Thread(){
                    @Override
                    public void run() {
                        g.printEvenNumber();
                    }
                }.start();
                return "Task 1";
            }
        });/*
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                GFG g=new GFG();
                new Thread(){
                    @Override
                    public void run() {
                        g.printEvenNumber();
                    }
                }.start();
                return "Task 2";
            }
        });*/


        java.util.List<Future<String>> futures = executorService.invokeAll(callables);

        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }

        executorService.shutdown();

    }
}
