public class Main {
    public static void main(String[] args) {
//Task 1
        int age = 67;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +  age + ", то он совершеннолетний");
        } else {
            System.out.println("нужно немного подождать");
        }
        // Task 2
        int temperature = 7;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        // Task 3
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else   {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        // Task 4
            if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            }
            else if (age >= 7 && age <=18)   {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            }
            else if (age > 18 && age <= 24)   {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
            }
            else if (age > 24 && age <60) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
            }
            else {
            System.out.println("Если возраст человека равен " + age + ", то ему можно отдохнуть.");
            }
        // Task 5
        if (age < 5 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        else if (age >= 5 && age <=14)   {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        //Task 6
        int amountOfSitsBook = 3;
        int amountOfStandsBook = 9;
        int numberOfSits = 2;
        int capacityOfCar = 102;
        int amountOfSits = 60;
        int amountOfStands = capacityOfCar - amountOfSits;

        boolean sittingPlace = true;
        boolean standingPlace = true;
        if (sittingPlace && amountOfSitsBook <= amountOfSits)   {
            System.out.println("Есть " + amountOfSitsBook + " сидячих места.");
        }
        else if (standingPlace && amountOfStandsBook <= amountOfStands) {
            System.out.println("Есть " + amountOfStandsBook + " стоячих места.");

        }
        else {
            System.out.println("Мест нет.");
        }


        // Task 7
        int one = 5;
    int two = 10;
    int three = 15;
    boolean oneBig = one > two && one > three;
    if ( oneBig ) {
        System.out.println(one);
    }
        else if (two > one && two > three) {
        System.out.println(two);
    }
        else {
        System.out.println(three);
    }
}
}





