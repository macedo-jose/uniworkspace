package lu.uni.programming1;

public class ConditionsWithoutCurlyBrackets {
    public static void main(String[] args) {
        boolean hungry, thirsty;

        hungry = thirsty = true;        // hungry and thirsty
        // hungry = true; thirsty = false; // just hungry
        // hungry = false; thirsty = true; // just thirsty
        // hungry = thirsty = false;       // neither hungry nor thirsty

        if (hungry)
            if (thirsty)
                System.out.println("hungry and thirsty");
            else
                System.out.println("just hungry");
        else
            if (thirsty)
                System.out.println("just thirsty");
            else
                System.out.println("neither hungry nor thirsty");
    }
}