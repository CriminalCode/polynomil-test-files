import java.util.*;
public class Term
{

 //Term temp;
 //String temp;
 Term temp;

 Integer key1;

 //	IList<Integer, Term> p1 = null;


 public Term term(Term str)
//public String term(String str)
 {
	 //String lol = str;
  // Term t = (Term)(Object)lol;
     temp = toString1(str);
     //temp = toString1(t);

     return temp;

 }

 /*
 public Integer getKey(String str)
 {
     String s = str.su
 }
 */


 //public Integer key(String str)
 public Integer key(Term str)

 {
    String t = (String)(Object)str;
  //  String s = str.substring(str.length() - 1);
    String s = t.substring(t.length() - 1);




    key1 = Integer.parseInt(s);

    return key1;

 }



 //public String toString1(String str)
 //public String toString1(Term str)
 public Term toString1(Term str)

 {
   String t = (String)(Object)str;
     //return String.format(str.substring(0,1)) + "x^" + key1;
    // return t.substring(0,1) + "x^" + key1;
     t = t.substring(0,1) + "x^" + key1;
     Term t1 = (Term)(Object)t;
     return t1;
 }



}
