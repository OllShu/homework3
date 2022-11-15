public class Main {
    public static void main(String[] args) {
        byte cup = 1;
        System.out.println("Значение переменной " + "cup" + " с типом " + "byte" + " равно " + cup);
        short pen = 2;
        System.out.println("Значение переменной " + "pen" + " с типом " + "short" + " равно " + pen);
        int book = 10;
        System.out.println("Значение переменной " + "book" + " с типом " + "int" + " равно " + book);
        long library = 200L;
        System.out.println("Значение переменной " + "library" + " с типом " + "long" + " равно " + library);
        float page = book + 1;
        System.out.println("Значение переменной " + "page" + " с типом " + "float" + " равно " + page);
        double paper = 1.12345678;
        System.out.println("Значение переменной " + "paper" + " с типом " + "double" + " равно " + paper);

        double sea = 27.12;
        System.out.println(sea);

        long sky = 987678965549L;
        System.out.println(sky);

        byte fox = 2;
        System.out.println(fox);

        short sun = 786;
        System.out.println(sun);

        boolean ad = false;
        System.out.println(ad);

        short we = 569;
        System.out.println(we);

        short oil = -159;
        System.out.println(oil);

        short cat = 27897;
        System.out.println(cat);

        byte dog = 67;
        System.out.println(dog);

        byte son;
        son = 1;
        System.out.println(son);
        short car;
        car = 5;
        System.out.println(car);
        int bed;
        bed = 2;
        System.out.println(bed);
        long man;
        man = 100L;
        System.out.println(man);
        float bag;
        bag = bed + 1;
        System.out.println(bag);
        double day;
        day = 100.12345678;
        System.out.println(day);
        boolean he;
        he = true;
        System.out.println(he);
        char a;
        a = 50;
        System.out.println("Задача номер " + a + " этой домашки выполнена");

        int studentsLudaP = 23;
        int studentsAnnaC = 27;
        int studentsKateA = 30;
        int students = studentsLudaP + studentsAnnaC + studentsKateA;
        int paperall = 480;
        int paperone = paperall/students;
        System.out.println("На каждого ученика рассчитано "+paperone+" листов бумаги");

        int timeall = 2;
        int bottles = 16;
        int efficiency = bottles/timeall;
        timeall = 20;
        bottles = efficiency*timeall;
            System.out.println("За "+timeall+" минут машина произвела бутылок "+bottles+" штук");

        int timeOneDay = 60*24;
        bottles = efficiency*timeOneDay;
        System.out.println("За 1 сутки машина произвела бутылок "+bottles+" штук");

        int days = 3;
        int timetotal = timeOneDay*days;
        bottles = efficiency*timetotal;
            System.out.println("За "+days+" дня машина произвела бутылок "+bottles+" штук");

        int month = 1;
        days = 30;
        timetotal = timeOneDay*days;
        bottles = efficiency*timetotal;
            System.out.println("За "+month+" месяц машина произвела бутылок "+bottles+" штук");

        int white = 2;
        int brown = 4;
        int paintOneOffice = white+brown;
        int totalpaint = 120;
        int schooloffice = totalpaint/paintOneOffice;
        int whitetotal = white*schooloffice;
        int browntotal = brown*schooloffice;
            System.out.println("В школе, где "+schooloffice+" классов, нужно "+whitetotal+" банок белой краски и "+browntotal+" банок коричневой краски");

        int banana = 5;
        int weightOneBanana = 80;
        int weightbananas = banana*weightOneBanana;

        int milk = 200;
        int weightOneMilk = 105;
        int weightmilk = milk/100*weightOneMilk;

        int iceCream = 2;
        int weightOneIceCream = 100;
        int weightIceCream = iceCream*weightOneIceCream;

        int eggs = 4;
        int weightOneEggs = 70;
        int weightEggs = eggs*weightOneEggs;

        double weightproducts = weightbananas+weightmilk+weightIceCream+weightEggs;
        weightproducts = weightproducts/1000;
            System.out.println("Завтрак спортсмена весит "+weightproducts+" кг");
    }
}