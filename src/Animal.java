public class Animal {

       public static void main(String[] args) { //psvm - skrót do metody main
        //System.out.println("hej");
           // podejście nr 1
         /*  Dog myDog = new Dog();
           Cow myCow = new Cow();
           myDog.speak(); myDog.eat();
           myCow.speak(); myCow.eat(); */

            // podejście nr 2
         /*  Animals myDog = new Dog();
           Animals myCow = new Cow();
           myDog.speak(); myDog.eat();
           myCow.speak(); myCow.eat(); */

           //podejście nr 3
           Animals[] animals = {
                   new Dog(),
                   new Cow()
           };
           for (Animals animal:animals) { //typ nazwa_elementu : nazwa_tablicy
               animal.speak();
               animal.eat();
           }
           // lub //or
           for (int i = 0; i < animals.length; i++) {
               animals[i].eat();
               animals[i].speak();
           }
       }
}
