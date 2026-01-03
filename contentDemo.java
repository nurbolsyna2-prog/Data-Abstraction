import java.util.ArrayList;
public class contentDemo {
   public static void main(String[] args) {

            ArrayList<ContentImage> items = new ArrayList<>();


            videoLecture lecture1 = new videoLecture("Java OOP Basics", 2024, 60, "HD");
            items.add(lecture1);


            int currentYear = java.time.Year.now().getValue();


            for (ContentImage item : items) {
                System.out.println(item.toString() + " | License Cost: " + item.getLicenseCost(currentYear));
            }
        }
    }

