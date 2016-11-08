package com.adb.classDemo;  
      
class Hello{  
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {  
        Class cc=Class.forName("com.adb.classDemo.Human");  
        Human hum=(Human)cc.newInstance();  
        hum.setName("Rollen");  
        hum.setAge(20);  
        System.out.println(hum);  
    }  
}  
	