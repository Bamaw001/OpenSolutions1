import java.util.Scanner;
public class SubtraktionUndAddition {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte die Dezimalzahl eingeben:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiplikation = berechneMultiplikation(a, b);
        System.out.println("Die Berechnung der Multiplikation der beiden Ganzenzahlen a:"+a+" und b:"+b+" ergibt: "+ multiplikation);
        //Validate if there is a number negative
        if(ueberpruefeObNegativeZahl(a,b)){
            //When number <0 enter here
            int subtraktion = berechneSubtraktion(a,b);
            System.out.println("Die Berechnung der Subtraktion der beiden Ganzenzahlen a:"+a+" und b:"+b+" ergibt: "+ subtraktion);
        }else {
            //When numbers !<0 enter here
            int addition = berechneAddition(a, b);
            System.out.println("Die Berechnung der Addition der beiden Ganzenzahlen a:" + a + " und b:" + b + " ergibt: " + addition);
        }
    }

    /*
    Method validate if there is a number negative
     */
    public static boolean ueberpruefeObNegativeZahl(int a, int b){
        if((a<0 && b>=0)||(b<0 && a>=0)){
            return true;
        }
        return false;
    }

    /*
    Calculate multiplication of 2 numbers
     */
    public static int berechneMultiplikation(int a, int b){
        return a * b;
    }

    /*
    Calculate multiplication when there is a number negative
     */
    public static int berechneSubtraktion(int a, int b){
        int c=0;
        if(a<0 && b>=0){
            for(int i=0;i<b;i++){
                c+=a;
            }
            return c;
        } else if (b<0 && a>=0) {
            for(int i=0;i<a;i++){
                c+=b;
            }
            return c;
        }
        return 0;

    }

    /*
    Calculate when there is no number negative
     */
    public static int berechneAddition(int a, int b){
        int c = a;
        for(int i=0;i<b;i++){
            c+=c;
        }
        return c;
    }

}
