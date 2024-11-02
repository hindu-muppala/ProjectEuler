import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        
    }
    public static String OpenBracket(String s, Stack<Character> q0)
    {
        int i=0,l=s.length();
        StringBuilder s0=new StringBuilder();
        while( i < l)
        {
            if(s.charAt(i)==']')
            {
                Character a= q0.pop();

                while( a!='[' )
                {
                    s0.append(a);
                    a= q0.pop();

                }
        
                Integer n= Integer.parseInt(q0.pop()+"");
                if(n%2==0)
                {
                    for(int k=0;k<n/2;k++)
                    {
                        s0.append(s0);
                    }
                }
                else
                {
                    n-=1;
                    StringBuilder s1=new StringBuilder(s0);
                    for(int k=0;k<n/2;k++)
                    {
                        s0.append(s0);
                    }
                    s0.append(s1);

                }
                s0.reverse();
            }
            else
            {
                q0.push(s.charAt(i));
            }
        }
        return s0.toString();

    }
}
