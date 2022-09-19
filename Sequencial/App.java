public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean ihaveNoUniform = true;

        if (ihaveNoUniform) {
            System.out.println("Mag palaba");
        } else {
            // Step 1
            walkMontana();

            // Step 2
            eatinkarinderya();

            // Step 3
            walktoNU();

           
        }

    }

    static void walkMontana() {
        System.out.println("Walk in Montana");
        System.out.println("Exit along Montana");
    }

    static void eatinkarinderya() {
        System.out.println("Eat in Karinderya");
        System.out.println("Exit at the Karinderya");
    }

    static void walktoNU() {
        System.out.println("WalktoNU");
        System.out.println("Exit at NU");
    }

  
    
}
