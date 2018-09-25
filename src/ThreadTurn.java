/**
 * @author 浦希成
 * 2018/9/24 20:10
 */
public class ThreadTurn {
    int a[]=new int[]{10,2,3,40};
    int b[]=new int[]{50,6,7,80};
    Object o = new Object();
    /**
     *   true 时线程1执行
     */
    Boolean f = true ;

    class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (o) {
                for (int i = 0; i < a.length; i++) {
                    System.out.println("A线程--->"+a[i]);
                    o.notify();
                    if(f){
                        f = false;
                        try{
                            o.wait();
                        }catch(Exception e){
                            System.out.print(e);
                        }
                    }
                }
            }
        }
    }

    class Thread2 extends Thread{
        @Override
        public void run(){
            synchronized (o){
                for(int i=0;i<b.length;i++){
                    System.out.println(" B线程--->"+b[i]);
                    o.notify();
                    if(!f){
                        f = true;
                        try {
                            o.wait();
                        }catch(Exception e){
                            System.out.print(e);
                        }
                    }
                }
            }
        }
    }

    public void start(){
        new Thread1().start();
        new Thread2().start();
    }

    public static void main(String args[]){
        ThreadTurn t = new ThreadTurn();
        t.start();
    }

}


