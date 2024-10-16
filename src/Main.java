public class Main {
    public static void main(String[] args) {

        int age=20;
        if (age> 18){
            System.out.println("Вам 18 или больше лет ");
        };
         if (age<18) {
            System.out.println(" Совершеннолетие еще не настумило, придется не много подождать");};

        int temperature=3;
        if (temperature> 5){
            System.out.println("Сегодня можно обойтись без шапки ");
        };
        if (temperature<5) {
            System.out.println("на улице холодно, надень шапку ");}

        int speed=50;
        if (speed> 60){
            System.out.println("Если скорость "+ speed +" то придется заплатить штраф");
        };
        if (speed<60) {
            System.out.println("Если скорость" + speed + " можно ездить спокойно");}

         age = 16;

        if (age >= 2 && age <= 6)
        {
            System.out.println("если человеку "+ age + " то ему надо ходить в детский сад");}
        if (age >= 7 && age <= 17);
        {
            System.out.println("если человеку "+ age + " то ему надо ходить в школу");}
        if (age >= 18 && age <= 24);
        {
            System.out.println("если человеку "+ age + " то его место в университете");}
        if(age > 24) ;
        {
            System.out.println("если человеку "+ age + " то ему надо ходить на работу ");}
        // task 5
        System.out.println( "task 5");

        age = 16 ;
        if (age  < 5 )
        {
            System.out.println("Если возраст ребенка равен "+ age + " то ему нельзя кататься на аттракционе");}
        if (age >=5 && age<14 )
        {
            System.out.println("Если возраст ребенка равен "+ age + " можно кататься на аттракционе в сопровождении ");}
        if ( age>=14 )
        {
            System.out.println("Если возраст ребенка равен "+ age + " можно кататься без сопровождения взрослого");}

        // task 6
        System.out.println("task 6");
        int places =102;
        int sitPlaces =60;
        int people =102;

        if ( people<sitPlaces )
        {
            System.out.println("В вагоне есть сидячие места");}

        if ( people<sitPlaces )
        {
            System.out.println("В вагоне есть сидячие места");}
        if ( people>=sitPlaces && people< places )
        {
            System.out.println("В вагоне есть стоячие места");}
        if ( people>= places  )
        {
            System.out.println("В вагоне нет мест");}

        //task 7
        System.out.println("task 7");
        int one =10;
        int two =5;
        int three =30;
        if ( one>= two && one>= three  )
        {
            System.out.println("максимальное число в переменной one, равно "+ one);}
        else {
            if (two >= three)
            {
                System.out.println("максимальное число в переменной two, равно "+ two);}
            else {
                System.out.println("максимальное число в переменной three, равно "+ three);
            }
        }



















    }
}