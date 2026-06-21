public class abcthreeline {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        char lowercase = 'a'; // Starting lowercase letter
        char uppercase = 'A'; // Starting uppercase letter

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= 2*i-1; j++) { // Loop for columns
                if (j % 2 == 1) {
                    // Print lowercase for odd positions
                    System.out.print(lowercase + " ");
                    lowercase++;
                } else {
                    // Print uppercase for even positions
                    System.out.print(uppercase + " ");
                    uppercase++;
                }
            }
            System.out.println(); // Move to the next line
        }
    }

}
