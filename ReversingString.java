public class ReversingString {
    public static void main(String[] args) {
        String name = "Ripunjai";
        String revname = "";
        for(int i = 0 ; i < name.length() ; i++){
            revname = name.charAt(i) + revname;
        }
        System.out.println(revname);
    }
}
