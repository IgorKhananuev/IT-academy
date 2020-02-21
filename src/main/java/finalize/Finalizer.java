package finalize;

class Finalizer {

    public static void main(String[] args) throws Throwable {
        //FinalizerRun finalizerRun = new FinalizerRun ();
        while (true){
            Thread.sleep (3000);
            new Test ( );
            System.out.println ("Total memory " + Runtime.getRuntime ().totalMemory () + " || " + "Free memory " +
                        Runtime.getRuntime ().freeMemory () );
            }
        }
    }




