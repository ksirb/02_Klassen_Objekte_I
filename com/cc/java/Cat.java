package com.cc.java;

public class Cat {

    private String name;
    private String furColor;
    private int age;

        public Cat(String name, String furColor, int age) {
            this.name = name;
            this.furColor = furColor;
            this.age = age;
        }

        

        public String getName() {
            return name;
        }



        public void setName(String name) {
            this.name = name;
        }



        public String getFurColor() {
            return furColor;
        }



        public void setFurColor(String furColor) {
            this.furColor = furColor;
        }



        public int getAge() {
            return age;
        }



        public void setAge(int age) {
            this.age = age;
        }



        public void changeName(String name) {
            this.name = name;
        }
    
public void tellYourAddress(){
   // Aufruf der Methode output() in der KLASSE App
   // this ist die Referenz des Objektes auf sich selbst
    App.output("Blick von innen: " + this);
}





    
}
