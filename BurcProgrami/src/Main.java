import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner scan = new Scanner(System.in);
        System.out.print("DOĞDUĞUNUZ AYI GİRİNİZ: ");
        month = scan.nextInt();

        if ((month <= 12) && (month >= 1)) {

            System.out.print("DOĞDUĞUNUZ GÜNÜ GİRİNİZ: ");
            day = scan.nextInt();

            //JANUARY
            if ((day <= 31) && (day >= 1)) {
                if (month == 1) {
                    if (day <= 21) {
                        System.out.println("OĞLAK");
                    } else {
                        System.out.println("KOVA");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //FEBRUARY
            if ((day <= 29) && (day >= 1)) {
                if (month == 2) {
                    if (day <= 19) {
                        System.out.println("KOVA");
                    } else {
                        System.out.println("BALIK");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //MARCH
            if ((day <= 31) && (day >= 1)) {
                if (month == 3) {
                    if (day <= 20) {
                        System.out.println("BALIK");
                    } else {
                        System.out.println("KOÇ");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //APRIL
            if ((day <= 30) && (day >= 1)) {
                if (month == 4) {
                    if (day <= 20) {
                        System.out.println("KOÇ");
                    } else {
                        System.out.println("BOĞA");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //MAY
            if ((day <= 31) && (day >= 1)) {
                if (month == 5) {
                    if (day <= 21) {
                        System.out.println("BOĞA");
                    } else {
                        System.out.println("İKİZLER");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //JUNE
            if ((day <= 30) && (day >= 1)) {
                if (month == 6) {
                    if (day <= 22) {
                        System.out.println("İKİZLER");
                    } else {
                        System.out.println("YENGEÇ");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //JULY
            if ((day <= 31) && (day >= 1)) {
                if (month == 7) {
                    if (day <= 22) {
                        System.out.println("YENGEÇ");
                    } else {
                        System.out.println("ASLAN");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //AUGUST
            if ((day <= 31) && (day >= 1)) {
                if (month == 8) {
                    if (day <= 22) {
                        System.out.println("ASLAN");
                    } else {
                        System.out.println("BAŞAK");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //SEPTEMBER
            if ((day <= 30) && (day >= 1)) {
                if (month == 9) {
                    if (day <= 22) {
                        System.out.println("BAŞAK");
                    } else {
                        System.out.println("TERAZİ");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //OCTOBER
            if ((day <= 31) && (day >= 1)) {
                if (month == 10) {
                    if (day <= 22) {
                        System.out.println("TERAZİ");
                    } else {
                        System.out.println("AKREP");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //NOVEMBER
            if ((day <= 30) && (day >= 1)) {
                if (month == 11) {
                    if (day <= 21) {
                        System.out.println("AKREP");
                    } else {
                        System.out.println("YAY");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ");
            }
            //DECEMBER
            if ((day <= 31) && (day >= 1)) {
                if (month == 12) {
                    if (day <= 21) {
                        System.out.println("YAY");
                    } else {
                        System.out.println("OĞLAK");
                    }
                }
            } else {
                System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ !");
            }

        } else {
            System.out.println("GEÇERSİZ BİRGÜN GİRDİNİZ!");
        }


    }
}
