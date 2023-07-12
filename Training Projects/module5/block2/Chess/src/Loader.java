public class Loader {

    static int length, width;
    public static String Chess[][];

    public static void main(String[]args){
        createChess(8,8);
    }

    public static void createChess(int length, int width){
        Chess = new String[length][width];
        for (int i = 0; i < length; i++){
            for (int a = 0; a < width; a++){

                boolean checkI = i % 2 == 0 ? true : false;
                boolean checkA = a % 2 == 0 ? true : false;
                if (checkI == false)Chess[i][a] = checkA == false ? "■" : "☐";
                if(checkI == true)Chess[i][a] = checkA == false ? "☐" : "■";
                Chess[i][a] += a == 7 ? "\n" : " ";
                System.out.print(Chess[i][a]);
            }
        }
    }
}
