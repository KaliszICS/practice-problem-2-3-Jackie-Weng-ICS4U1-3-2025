public class PracticeProblem {

    public static void bubbleSortString(String[] strings) {
        int n = strings.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                
                if (strings[j].compareToIgnoreCase(strings[j + 1]) > 0) { // just in case something does wrong or the wrong case or something!! not really needed
                    
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                    swapped = true;
                }
            }

            
            if (!swapped) {
                break;
            }
        }
    }

    
    public static void main(String[] args) {
        String[] sample = {"catty", "purple", "dogie", "cooper"};

        bubbleSortString(sample);

        for (String s : sample) {
            System.out.println(s);
        }
    }
}
