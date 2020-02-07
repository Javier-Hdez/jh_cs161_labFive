//HEADER
//Program Name: Lab 5
//Author: Javier Hernandez
//Date: 2/6/2020
//Description: Created, edited and printed info for a person. 



class Main{
 public static void main(String[] args) {
     Person one = new Person("Bob", "Man", 24);
     System.out.println(one.getInfo());

    one.changeInformation("Matt", "Man", 26);
    System.out.println(one.getInfo());



    }





}
/* FOOTER
Bob Man 24
Matt Man 26
*/