package beginner;

public class Loops {
    public static int sumAllIntsBelowUpTo5AndExcludeTwoUsingFor(int limitNumber){
        int sum = 0;
        for (int i=0;i<=limitNumber; i++){
            if (i==2){
                continue;
            }
            sum += i;
            if (i==5) {
                break;
            }
        }
        return sum;
    }

    public static int sumAllIntsBelowUpTo5AndExcludeTwoUsingWhile(int limitNumber){
        int sum = 0;
        int i=0;
        while ((i<=4) && (i<limitNumber)){
            i++;
            if (i == 2){
                continue;
            }
            sum += i;

        }
        return sum;
    }

    public static Boolean numberInMatrix(int number){
        int[][] numberMatrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        Boolean found = false;
        search:
        for (int i=0;i<numberMatrix.length; i++){
            for (int j=0;j<numberMatrix[i].length; j++){
                if (number == numberMatrix[i][j]){
                    found = true;
                    break search;
                }
            }
        }
        return found;
    }


}
