package EgenArrayList;

public class Main {
    public static void main(String[] args) {

        EgenArraylist<String> egenList = new EgenArraylist<>();
        egenList.add("Admir");
        egenList.add("Andreas");
        egenList.add("Stefan");
        egenList.add("Nadiia");
        System.out.println(egenList.get(0));

        egenList.remove(3);

        egenList.clear();
      
    }
}
