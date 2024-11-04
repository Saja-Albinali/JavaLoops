public class WeekdaysPrinter {
    public static void main(String[] args) {
        String[] days ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for(String day:days){
         if (!day.equals("Friday")&& !day.equals("Saturday"))
             System.out.println(day);
        }
    }
}
