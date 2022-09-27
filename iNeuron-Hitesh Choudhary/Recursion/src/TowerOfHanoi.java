public class TowerOfHanoi {
    static void towerOfHanoi(int n, char from, char to, char using){
        if (n>0){
            towerOfHanoi(n-1, from, using, to);
            System.out.println("Move one Disc from "+from+" to "+to);
            towerOfHanoi(n-1,using,to,from);
        }
    }


    public static void main(String[] args) {
        towerOfHanoi(4,'A','B','C');
    }
}
