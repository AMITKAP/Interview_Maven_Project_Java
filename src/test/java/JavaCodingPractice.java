import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaCodingPractice
{

    @Test
    public static void checkVowelsInAString()
    {
        String testString="amit kapoor";
        String testString1="010101";
        System.out.println(testString.toLowerCase().matches(".*[aeiou].*"));
    }

    @Test
    public static void removeSpacesFromAString()
    {

        String str="amit kapoor";
        StringBuilder bld= new StringBuilder();

        for(char ch:str.toCharArray())
        {
            if(!Character.isWhitespace(ch))
            {
                    bld.append(ch);
            }
        }

        System.out.println(bld);
    }

    @Test
    public static void swapNumbersWithoutUsingTempVar()
    {
           int a=10;
           int b=20;

           b=b+a;
           a=b-a;
           b=b-a;

           System.out.println(a);
           System.out.println(b);

    }

    @Test
    public static void sortArrayElements()
    {
        int a[]={10,2,0};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public static void ArrayElementsToList()
    {
        int b[]={20,10,1};
        List<int[]> l=Arrays.asList(b);
    }

    @Test
    public static void reverseWords()
    {

        String str="amit kapoor";
        String wordsArray[] =str.split(" ");
        String revWord="";
        StringBuilder revString=new StringBuilder();

        for(int i=0;i<wordsArray.length;i++)
        {
          char array[]=  wordsArray[i].toCharArray();

          for(int j=array.length-1;j>=0;j--)
          {

              revWord=revWord+array[j];
          }

            revString.append(revWord).append(" ");

        }

        System.out.println(revString);
    }

    @Test
    public void stringArrayEquality()
    {

        String[] word1 =new String[]{"ab","c"};
        String[] word2 =new String[]{"a","bc"};
        StringBuilder bld1=new StringBuilder();
        StringBuilder bld2=new StringBuilder();

        for(String str:word1)
        {
            bld1.append(str);
        }
        for(String str:word2)
        {
            bld2.append(str);
        }

        System.out.println(bld1.compareTo(bld2));

    }

    @Test
    public boolean numberPalindrome()
    {
        int numberOfDigits=String.valueOf(121).length();
        int reminder=0;
        int quotient=0;
        double reverseNumber=0;
        quotient=121;

        for(int i=1;i<=numberOfDigits;i++)
        {
            reminder= quotient%10;
            quotient=121/10;

            reverseNumber=reverseNumber+reminder*Math.pow(10,(numberOfDigits-1));
        }

        if(121==(int)reverseNumber)
            return true;
        else
            return false;
    }

    @Test
    public void removeVowelsFromAString()
    {
        String test="amit kapoor";
        StringBuilder bh=new StringBuilder();

        for(char ch:test.toCharArray())
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                 continue;
            }
            else
                bh.append(ch);
        }

     System.out.println(bh.toString());

    }

    @Test
    public void maxOcuCharInAString()
    {
        String test="amit kapooor";
        char maxKey =0;
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();

        for(char ch: test.toCharArray())
        {
            if(map.containsKey(ch))
            {

                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }

        int maxOcu=map.get(test.charAt(0));
        maxKey=test.charAt(0);

        for(Map.Entry<Character,Integer> ent: map.entrySet())
        {
            if(ent.getValue()>maxOcu)
            {
                maxKey= ent.getKey();
            }

        }

        System.out.println(maxKey);

    }

    @Test
    public void separatingZerosFromNonZeros()
    {
        int[] array={1,0,2,6,7,0};
        int[] finalArray=new int[array.length];
        int k = 0;

        for(int i=0;i<array.length;i++)
        {

            if (array[i] != 0) {
                finalArray[i] = array[i];
                k++;
            }

        }

        for(int l=k;l<finalArray.length;l++)
        {
                finalArray[l]=0;
        }

        System.out.println(Arrays.toString(finalArray));
    }

}
