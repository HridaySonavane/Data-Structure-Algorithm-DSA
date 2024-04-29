public class searchInSting {

    public static boolean search(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        //search for a character in string
        String name = "Hriday";
        char target = 'i';
        boolean ans = search(name, target);
        System.out.println(ans);

    }
}
