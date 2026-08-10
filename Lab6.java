public class Lab6 {
    static class Test {
        Test() {
            System.out.println("Object Created");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object Destroyed");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Create multiple objects
        Test t1 = new Test();
        Test t2 = new Test();

        // Make them eligible for GC
        t1 = null;
        t2 = null;

        System.out.println("Garbage Collection Requested");
        System.gc();
        System.runFinalization();

        // Introduce a small delay to allow the garbage collection thread to run finalize()
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}
