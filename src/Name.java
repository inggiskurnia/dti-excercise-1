public class Name {

    public static String findInitials (String name) {
        String[] nameSplit = name.split(" ");

        StringBuilder initials = new StringBuilder();

        for (int i=0; i<nameSplit.length; i++) {
            initials.append(String.valueOf(nameSplit[i].charAt(0)));
        }
        return initials.toString();
    }
}
