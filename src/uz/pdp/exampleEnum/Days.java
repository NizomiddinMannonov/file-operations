package uz.pdp.exampleEnum;

public enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    static Days [] DAYS=Days.values();

    public static Days olibBer(int raqam){
     if (raqam<1||raqam>7){
         throw  new KunXato("Oka bunaqa "+raqam+" lik kun yo'q ");
     }
     return DAYS[raqam-1];
    }


}
