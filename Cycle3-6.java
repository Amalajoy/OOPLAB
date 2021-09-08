class Reverse 
{  
 public static String reverseWord(String str)
 {  
   String word[]=str.split("\\s");  
   String reverseWord="";  
    for(String w:word){  
       StringBuilder sb=new StringBuilder(w);  
       sb.reverse();  
       reverseWord+=sb.toString()+ " ";  }  
   
    return reverseWord.trim(); 
 }  
} 

class Hello
{  
 public static void main(String[] args) 
 {  
   String word = "SREE NARAYANA GURUKULAM COLLEGE OF ENGINEERING";
   System.out.println("The original string is: " + word);
   System.out.println(StringFormatter.reverseWord(word));  
//System.out.println("The modified string is: " + reverseWord.trim()); 
 }  
}  
