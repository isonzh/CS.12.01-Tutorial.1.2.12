public class Successors {
    public static Position findPosition(int num, int[][] arr){

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==num){
                Position pos = new Position(i,j);
                return pos;
            }
        }
    }
    return null;
    }
    public static Position[][] getSuccessorArray(int[][]arr){
       Position[][] successor= new Position[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                    for(int p=0;p<arr.length;p++){
                        for(int q=0;q<arr[i].length;q++){
                            if(arr[i][j]==arr[p][q]-1){
                                Position pos = new Position(p,q);
                                successor[i][j]=pos;
                            }
                        }

                }
            }

        }
        return successor;
    }
}
