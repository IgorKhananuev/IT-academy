package finalize;

class Test {

    Long[] longs = new Long[15000000];
    //long[] longs1 = new long[10000000];

    @Override
    public  void finalize() {
        System.out.println ("Finalizer runs and clear Heap memory");
    }
}
