package college.util;
public class TextUtils {

    private static int counter=0;

    private TextUtil()
    {
    }

    public static int getcount()
    {
        return counter;
    }

    public static String normalizeName(String name) throws IllegalArgumentException
    {
        if(name==null || name.isBlank())
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        else
        {
            int i=0;
            char[] ne=name.toCharArray();

            while(i<name.length() && ne[i]==' ')
            {
                i++;
            }

            name=name.substring(i);

            StringBuilder sc=new StringBuilder(name);

            for(i=0;i<sc.length()-1;i++)
            {
                if(sc.charAt(i)==' ' && sc.charAt(i+1)==' ')
                {
                    sc.deleteCharAt(i);
                    i--;
                }
            }

            name=sc.toString().trim();

            String[] words=name.split(" ");
            String result="";

            for(i=0;i<words.length;i++)
            {
                words[i]=words[i].substring(0,1).toUpperCase()
                        +words[i].substring(1).toLowerCase();

                result=result+words[i]+" ";
            }

            counter++;

            return result.trim();
        }
    }
}

