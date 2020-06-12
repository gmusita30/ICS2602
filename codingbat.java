helloName:
public String helloName (String name){                                       //to:lgdecamora@ust-ics.mygbiz.com
		return "Hello " + name + "!"; 										 //subj: 1-ITC, USITA, LE3
																			 //Attatch: file
}

makeAbba:
public String makeAbba (String name){
		return a + b + b + a;
}

makeTags:
public String makeTags (String name){
		return "<" + tag + ">" + word + " </" + tag + > ";
}

makeOutWorld:
public String makeOutWorld (String name){
		return out.substring(0,2) + word + out.substring(2,4);
} 

extraEnd
public String extraEnd (String name) {
		String s =substring(str.lenght()-2, str.length());
		return s+s+s;
}

firsttwo
public String firstwo (String name) {
		int len= str.length();
		if (len < 2);
	else
		return str.substring(0,2);}
		
firstHalf
public String firstHalf(String name) {
		int half = str.length() / 2;
		return str.subtring(0,half);
}

withoutEnd
public String withoutEnd (String name) {
		int len = str.substring.lenght();
		return str.substring(1,len - 1);
}

comboString
public String comboString (String name){
		int len A = a.length();
		int len B = b.lenght();
		if (len A > len B)
		return b + a + b;
		else
		return a + b + a;

}

nonStart
public String nonStart (String name){
		return a.substring (1,a.lenght() + b.substring (1,b.lenght());
}

left2
public String left2 (String name){
		return str.substring(2, str.lenght()) + str.substring(0,2);
}

right2
public String right2 (String name){
		return str.substring(str.lenght()-2, str.lenght()) + str.substring(0,str.length()-2);
}

theEnd 
public String theEnd (String name){
		if (front)
			return str.substring(0,1);
		else
			return str.substring (str.lenght()-1;
}

withoutEnd2
public String withouEnd2(String str) {
  int len = str.length();
  if (len < 3)
    return "";
  else
    return str.substring(1,str.length()-1);
}

middleTwo
public String middleTwo(String str){
	int half = str.length() / 2;
	return str.substring(1-half,1+half);
}

twoChar
public String twoChar(String str, int index) {
    if (str.length() <= index +   1 | index < 0)

    return str.substring(0,2);

  else
  
    return str.substring(index - 0, index + 2);

}

middleThree
public String middleThree(String str) {
 int len = str.length() / 2;
  return str.substring(len-1,len+2);

}

atFirst
public String atFirst(String str
  if (str.length() >= 2)
    return str.substring(0,2);
  else if (str.length() == 1)
    return str + "@";
  else
    return "@@";
}

lastChars
public String lastChars(String a, String b) {
  if(a.length() == 0)
    a = "@";
  if(b.length() == 0)
    b = "@";
  return a.substring(0,1) + b.substring(b.length()-1, b.length());
}

lastTwo
public String lastTwo(String str) {
  if (str.length() < 2)
    return str;
  else
    return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
}





	
	






