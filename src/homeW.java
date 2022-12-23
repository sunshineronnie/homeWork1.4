public class homeW {
    public static void main (String [] args){


        int clientOS = 1;
if (clientOS == 1){
    System.out.println(" установите версию приложения android по ссылке");
}
if (clientOS ==  0) {
    System.out.println( "установите версию приложения iOS по ссылке");


        }

int clientDeviceYear = 2014;
if (clientDeviceYear < 2015 && clientOS == 1){
    System.out.println(" Установите облегченную версию приложения для Android по ссылке");
} else if (clientDeviceYear < 2015 && clientOS == 0) {
    System.out.println(" Установите облегченную версию приложения для iOS по ссылке");

}

int year = 2020;
if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
    System.out.println( year + " year is leap");

} else {
    System.out.println(year + " year is not leap");
}

int deliveryDistance = 95;
if (deliveryDistance <= 20){
    System.out.println( "доставка карты займет 1 день ");
} else if (deliveryDistance >= 20 && deliveryDistance < 60) {
    System.out.println("доставка карты займет 2 день");

    
} else if (deliveryDistance >= 60 && deliveryDistance < 100){
    System.out.println("доставка карты займет 3 день");
} else {
    System.out.println(" извините, мы не можем доставить карту");
}

int monthNumber = 13;
switch (monthNumber){
    case 12,1,2:
        System.out.println("winter");
        break;
    case 3,4,5:
        System.out.println("spring");
        break;
    case 6,7,8:
        System.out.println("summer");
        break;
    case 9,10,11:
        System.out.println("autumn");
        break;
    default:
        System.out.println("this month is not exist");
}

    }
}

