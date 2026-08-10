public class Lab7 {
    static class Demo {
        Demo() {
            System.out.println("Object Created");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("finalize() method called");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        
        // Making the object eligible for garbage collection
        d = null;
        
        // Requesting Garbage Collection
        System.gc();
        System.runFinalization();

        // Pause briefly to give the GC finalizer thread time to print
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}
