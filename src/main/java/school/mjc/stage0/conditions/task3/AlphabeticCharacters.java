package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z'){
            if (character == 'a' || character == 'i' || character == 'e' || character == 'u' || character == 'o'){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
