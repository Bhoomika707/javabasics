public class CountVowels {
    public static void main(String[] args) {
        String input = "Java123 Programming";

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (c == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Digits : " + digits);
        System.out.println("Spaces : " + spaces);
    }
}
