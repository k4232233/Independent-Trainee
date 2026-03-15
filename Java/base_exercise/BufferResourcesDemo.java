package BufferResources;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author haoran.xu
 */
public class BufferResourcesDemo {
    public static void main(String[] args) {
        BufferResources bufferResources = new BufferResources();
        for (int i = 0; i < 10; i++) {
            new Producter(bufferResources).start();
        }
        for (int i = 0; i < 10; i++) {
            new Consumer(bufferResources).start();
        }
    }
}

// 缓存资源区
class BufferResources {
    // 设置最大容量
    private int maxSize = 10;
    // 创建阻塞队列
    private final BlockingQueue buffer = new LinkedBlockingQueue(maxSize);

    // 提供消费方法
    public void consume() {
        try {
            Integer value = (Integer) buffer.take();
            System.out.println(Thread.currentThread().getName() + "消费成功" + value.toString() + "当前缓冲区大小=" + buffer.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 提供生产方法
    public void product(Integer value) {
        try {
            buffer.put(value);
            System.out.println(Thread.currentThread().getName() + "生产成功" + value.toString() + "当前缓冲区大小=" + buffer.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//生产者
class Producter extends Thread {
    // 创建生产区
    private final BufferResources bufferResources;
    Random r = new Random();

    // 构造方法指定缓冲区
    public Producter(BufferResources bufferResources) {
        this.bufferResources = bufferResources;
    }

    @Override
    public void run() {
        //生产
        this.bufferResources.product(r.nextInt());
    }
}


//消费者

class Consumer extends Thread{
    private final BufferResources bufferResources;
    public Consumer(BufferResources bufferResources){
        this.bufferResources = bufferResources;
    }

    @Override
    public void run() {
        this.bufferResources.consume();
    }
}