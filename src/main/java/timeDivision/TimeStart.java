package timeDivision;


public class TimeStart {
    public static void main(String[] args) {
        TimeInterval tm1 = new TimeInterval(1, 1, 0);
        TimeInterval tm2 = new TimeInterval(1);
        TimeInterval tm3 = new TimeInterval(1);
        System.out.println(tm1.toString());
        System.out.println("Converter time interval into seconds. Result is " +  tm1.converterIntoSecond() + " sec");
        System.out.println("Compare of two objects: result is " + tm1.compareTwoObjects(tm2));
        System.out.println("Compare of two objects: result is " + tm2.compareTwoObjects(tm1));
        System.out.println("Compare of two objects: result is " + tm2.compareTwoObjects(tm3));
    }
}
