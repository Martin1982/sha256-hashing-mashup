import java.security.MessageDigest;

class sha256
{

    public static void main(String args[]) 
        throws Exception
    {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String text = "Enter values" + " here";
        md.update(text.getBytes());
        byte[] byteData = md.digest();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
 
        System.out.println(sb.toString());
    }
}
