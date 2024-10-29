public class coolnums {
    public static boolean iscoolnums(int num){
        int x = 0;
        x = 6;

        for (x = 6; x < num; x++){
            if ((x%3==1)&&(x%6==1)&&(x%4==1)&&(x%5==1)){
                return true;
            }
        }
        return false;

    }
    public static int countcoolnums(int stop){
        boolean check = iscoolnums(stop);
        int b=0;
            for (b=0;b<stop;b++){
                if (check == true){
                }else{
                    b=b-1;
                }
            }
            return b;

    }

}
