class NonDeterministric 
{
    public static void main(String[] args)
    {
        // to find where the string has the following string or not
      System.out.print(sub("abc",0,"bacbbbb",0,false,0,"abc"));

    }

 static boolean sub(String s1,int StringIndex1,String s2,int StringIndex2, boolean condi,int index, String main)
    {

      

        if(s1.length()-1==StringIndex1)
        {
            condi=true;
        }

        if(s2.length()-1==StringIndex2)
        {
            condi=true;
        }
        if(index==main.length()-1)
        {
            return condi;
        }

        if(main.charAt(index)==s1.charAt(StringIndex1))
        {

          condi=  sub(s1, StringIndex1+1,s2,StringIndex2, condi, index+1,main);

          System.out.print("I am in Q"+StringIndex1+1);

        }
        else
        {

          condi=  sub(s1, 0,s2,StringIndex2, condi, index+1,main);

          System.out.print("I am in Q0-->");

        }

         if(main.charAt(index)==s2.charAt(StringIndex2))
        {

          condi=  sub(s2, StringIndex1,s2,StringIndex2+1, condi, index+1,main);

           System.out.print("I am in Q"+StringIndex2+index+2+"--->>>>");
        }
        else
        {
          condi=  sub(s2, 0,s2,StringIndex2+1, condi, index+1,main);
        }

        return condi;
    }
}