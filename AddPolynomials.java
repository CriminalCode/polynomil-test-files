import java.io.*;
import java.util.*;
//import java.io.IOException;
public class AddPolynomials extends Term
{
  Term t;

    int Size;


 //if you want to test this rename to a temp file location

    static File inputF;
    static Scanner inF;

public IList<Integer, Term> readPolynomial(String filename) throws IOException
   {

    inputF = new File (filename);
    inF = new Scanner(inputF);

    IList<Integer, Term> plist1 = null;

    while(inF.hasNextLine() )
    {
        String tempstr = inF.nextLine();

        //Term t = tempstr;
        Term t = (Term)(Object)tempstr;
        // t = new Object(tempstr);
         //t = tempstr;



      plist1.add(key(t), term(t));
    }

    return plist1;



   }


public IList<Integer, Term> add(IList<Integer, Term> p1, IList<Integer, Term> p2)
  {

    IList<Integer, Term> plist2 = null;

    if(p1.getSize() > p2.getSize())
    {

        Size = p1.getSize();
    }

    else
    {
        Size = p2.getSize();
    }

    for(int i = 0; i <= Size; i ++)
    {


    // plist2.add(p1.remove(i - 1) + p2.remove(i - 1) );
    if(p1.remove(i - 1) || p2.remove(i -1))
    {
      Term t1 = p1.find(i -1);
      Term t2 = p2.find(i - 1);
//


      String l = (String)(Object)t1;
      String l2 = (String)(Object)t2;
        //return String.format(str.substring(0,1)) + "x^" + key1;
       // return t.substring(0,1) + "x^" + key1;
        l = l.substring(0,1);
        l2 = l2.substring(0,1);

        int lolman = Integer.parseInt(l);
        int lolman2 = Integer.parseInt(l2);
        int TotalP = lolman + lolman2;
        Term TotalP2 = (Term)(Object)TotalP;

        // use plist2
        int I = i -1;
        Term FinalI=(Term)(Object)I;

        plist2.add(key(FinalI) , term(TotalP2));

    }


    }

    return plist2;

  }


}
