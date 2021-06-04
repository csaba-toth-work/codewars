package hq9;

public class HQ2 {

    public static String HQ9(char code) {
        switch (code) {
            case 'H':
                return "Hello World!";
            case 'Q':
                return Character.toString(code);
            case '9':
                return buildLyrics();
            default:
                return null;
        }
    }

    public static String buildLyrics() {
        StringBuilder sb = new StringBuilder();
        for (int i = 99; i > 1; i--) {
            sb.append(i + " bottles of beer on the wall, " + i + " bottles of beer.\n");
            sb.append("Take one down and pass it around, " + (i - 1));

            if (i - 1 == 1) {
                sb.append(" bottle of beer on the wall.\n");
            } else {
                sb.append(" bottles of beer on the wall.\n");
            }
        }
        sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
        sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n");
        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
        sb.append("Go to the store and buy some more, 99 bottles of beer on the wall.");
        return sb.toString();
    }
}
