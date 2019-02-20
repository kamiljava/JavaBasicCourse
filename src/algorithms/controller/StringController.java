package algorithms.controller;

public class StringController {

    String content = "Example content: Lorem ipsum Lorem ipsum";

    public boolean isCharacter(char c){

        int search = content.indexOf(c);
        return search != -1 ? true : false;
    }

    public int countAllCharacters(char c) {
        int counter = 0;

        for (int i = 0;i<content.length();i++){
            if (content.charAt(i)==c){
                counter++;
            }
        }
        return counter;
}
    public int countUpperCases(){
        int upperCaseCounter = 0;
        for (int i = 0 ; i<content.length();i++){
            if ((int)content.charAt(i)>= 65 && (int)content.charAt(i)<=90){
                upperCaseCounter++;
            }
        }
        return upperCaseCounter;
    }
    public String reverse(){
            String tmp = "";
            for (int i = content.length()-1; i >=0; i--){
                tmp += content.charAt(i);
            }
        return tmp;
    }
}
