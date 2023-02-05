package sorucozumu;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) throws InterruptedException {

        String KahveCesitleri=
                        "1-)Dibek Kahvesi\n" +
                        "2-)Filtre Kahve\n" +
                        "3-)Turk Kahvesi\n" +
                        "4-)Espresso\n" +
                        "5-)Sutlu Turk Kahvesi";
        System.out.println(KahveCesitleri);
        System.out.println("Kac numarali kahveyi almak istersiniz...");
        Scanner input=new Scanner(System.in);
        int kahvesecimi=input.nextInt();

        String seker=
                        "a-)Sekersiz\n" +
                        "b-)Az Sekerli\n" +
                        "c-)Orta Sekerli\n" +
                        "d-)Sekerli";
        System.out.println(seker);
        System.out.println("Kahvenizin seker durumunu seciniz...");
        input.nextLine();
        String sekersayisi=input.nextLine();

        String secim="";
         if (sekersayisi.equalsIgnoreCase("a")){
             secim="Sekersiz";
         }else if (sekersayisi.equalsIgnoreCase("b")){
            secim="Az sekerli";
        }else if (sekersayisi.equalsIgnoreCase("c")) {
             secim = "Orta sekerli";
         }else if (sekersayisi.equalsIgnoreCase("d")) {
             secim = "sekerli";
         }else{
             System.out.println("Seker seciminiz hatalidir...");
         }

        System.out.println("sut eklememi ister misiniz");
         String sut=input.next();
         if (sut.equalsIgnoreCase("evet")){
             System.out.println("sut eklendi...");
         }else if (sut.equalsIgnoreCase("hayir")){
             System.out.println("sut eklenmiyor..");
         }




         switch (kahvesecimi){
             case 1:
                 System.out.println("Kahveniz hazirlaniyor...");
                 Thread.sleep(5000);
                 String bildirim=secim+"Dibek kahveniz hazir\nAfiyet olsun.";
                 System.out.println(bildirim);
                 break;
             case 2:
                 System.out.println("Kahveniz hazirlaniyor...");
                 Thread.sleep(5000);
                 String bildirim2=secim+" Filtre  kahveniz hazir\n Afiyet olsun.";
                 System.out.println(bildirim2);
                 break;
             case 3:
                 System.out.println("Kahveniz hazirlaniyor...");
                 Thread.sleep(5000);
                 String bildirim3=secim+" Turk  kahveniz hazir\n Afiyet olsun.";
                 System.out.println(bildirim3);
                 break;
             case 4:
                 System.out.println("Kahveniz hazirlaniyor...");
                 Thread.sleep(5000);
                 String bildirim4=secim+" Espresso  kahveniz hazir\n Afiyet olsun.";
                 System.out.println(bildirim4);
                 break;

             case 5:
                 System.out.println("Kahveniz hazirlaniyor...");
                 Thread.sleep(2000);
                 String bildirim5=secim+" Sutlu Turk  kahveniz hazir\n Afiyet olsun.";
                 System.out.println(bildirim5);
                 break;
             default:
                 System.out.println("Kahve seciminiz hatalidir...");





         }

    }
}
