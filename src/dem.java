public class dem {
    public static void main(String[] args) {
        String str="aabbccabc";
        String kitu="a";

        int count=0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)==kitu.charAt(i)){
                count++;
            }

        }
        System.out.println("so lan xuat hien: "+count);
    }
}
