package lu.uni.programming1;

public class SwitchExpressions {

    public static void main(String[] args) {
        String artist = "Rembrandt";
        String profession;

        profession = switch (artist) {
            case "Monet", "Rembrandt" -> "painter";
            case "Bach", "Mozart" -> "composer";
            default -> {
                System.out.println("just an example block illustrating 'yield' ...");
                yield "unknown";
            }
        };
        System.out.println(artist + "'s profession is " + profession);
    }
    
}
