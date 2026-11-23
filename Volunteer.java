public class Volunteer {
    public static void main(String[] args) {
        String[] volunteerList = new String[8];
        volunteerList[0] = "Robert";
        volunteerList[1] = "Penelope";
        volunteerList[1] = "Penny";

        for (int i = 0; i < volunteerList.length; i++) {
            if (volunteerList[i] == null) {
                volunteerList[i] = "Student";
            }
        }

        for (String person : volunteerList) {
            System.out.println(person);
        }
    }
}