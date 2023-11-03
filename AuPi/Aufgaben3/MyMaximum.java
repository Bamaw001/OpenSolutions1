public class MyMaximum {
    public static void main(String[] args){
        int max= maximum(-1, -5, -25);
        System.out.println(max);
        System.out.println(maximum(0, 10, -10));//10
        System.out.println(maximum(10, 10, 10));//10
        System.out.println(maximum(19, 17, 13));//19
        System.out.println(maximum(-13, -17, -19));//-13
    }


    //Aufgabe 1
    /*
    a)
    Gegeben seien drei int-Werte x, y, und z.
    Schreiben Sie eine Java-Funktion, die das
    Maximum dieser drei Werte bestimmt.
    b)
    Testen Sie Ihre Funktion in einer Java-Anwendung
    zumindest mit den folgenden vier Wertebele-gungen
    für x, y, und z:#
     -   0, 10, -10
     -  10, 10, 10
     -  19, 17, 13 - und
     - -13, -17, -19
     */
    public static int maximum(int x,int y, int z){

        if(x<y) {
            if (y < z) {
                return z;
            }
            else
            { return y;}
        }
        else if(x<z){
            return z;
        } else {
            return x;
        }
        //Algorithmus:
        /*
        1 Zahl kleiner als die 2 Zahl ist,
           dann 2 Zahl mit 3 Zahl vergleichen,
           wenn 2 Zahl größer return 2 Zahl,
           wenn 3 Zahl größer return 3 Zahl.
         */



    }




}
