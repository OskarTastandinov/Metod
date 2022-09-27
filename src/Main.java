public class Main {
    int year = 2100;
    public static void main(String[] args){
        System.out.println("Задание 3");
        checkingYear();

    }
    public static void checkingYear(){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println(year + " год является високосным");

        }else{
            System.out.println(year + " год не является високосным");
        }


    }
}
