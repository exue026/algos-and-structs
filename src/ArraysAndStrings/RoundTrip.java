package ArraysAndStrings;

public class RoundTrip {

    public static void main(String[] args) {

        char[] directions = {'N', 'S', 'E', 'W', 'W', 'E'};
        System.out.println(canReturnIn10Min(directions));
    }

    /**
     * Given an list with multiple directions ("N", "S", "E" and  "W"), each direction would take 1 minute to complete.
     * Return if the directions list can return to the same start location within 10 minutes.
     */

    static boolean canReturnIn10Min(char[] directions) {
        int length = directions.length < 10 ? directions.length : 10;
        int[] coordinates = new int[2];

        for (int i = 0; i < length; i++) {
            switch(directions[i]) {
                case 'N':
                    coordinates[1]++;
                    break;
                case 'S':
                    coordinates[1]--;
                    break;
                case 'E':
                    coordinates[0]++;
                    break;
                case 'W':
                    coordinates[0]--;
            }
        }
        return (coordinates[0] == 0 && coordinates[1] == 0);
    }
}
