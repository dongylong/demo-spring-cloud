package com.cloud.hystrixdashboard;

/**
 * @author dongyl
 * @date 10:35 9/30/18
 * @project demo-spring-cloud
 */
public abstract class ThreadTask<T> extends Thread {

    @Override
    public void run() {
        super.run();
    }

    /**
     * 任务开始之前调用，运行在主线程
     */
    @MainThread
    public void onStart() {
    }

    /**
     * 子线程中调用，运行在子线程     * @return
     */
    @WorkerThread
    public abstract T onDoInBackground();

    /**
     * 子线程返回的结果，运行在主线程     * @param t
     */
    @MainThread
    public void onResult(T t) {
    }


}
