class Vowels{
public static void main(String[] args){
String str="muthu";
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u'){
System.out.println("Vowels");
}
else{
System.out.println("Consonants");
}
}
}
}