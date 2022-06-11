package com.ya;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if(name!=null&&
                ((!name.startsWith(" "))&&(!name.endsWith(" "))&&
                (name.length()-name.replaceAll(" ","").length()==1)&&
                ((name.length()>=3)&&(name.length()<=19)))){
            return true;
        }
        else {
            return false;
        }
       /* if((name.length()<3)||(name.length()>19)){
            return false;
        }
        else if ((name.startsWith(" "))||(name.endsWith(" "))){
            return false;
        }
        else if (name.length()-name.replaceAll(" ","").length()!=1){
            return false;
        }
        else{return true;}
*/
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

    }
}
