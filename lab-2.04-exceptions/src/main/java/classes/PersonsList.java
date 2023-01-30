package classes;

import java.util.ArrayList;
import java.util.List;

public class PersonsList{
    public static Person findByName(String name, ArrayList<Person> pList){
                for (Person p:pList) {

                      String myName =  p.getName();
                      if(!myName.contains(" ")){
                              throw new IllegalArgumentException("Do you need to type your Firstname properly :D");
                      }else if(myName == name){
                              return p;

                        }
                }
                return null;
        }











}
