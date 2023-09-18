/*
Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him
through his handwriting. He found a magazine and wants to know if he can cut out whole words
from it and use them to create an untraceable replica of his ransom note. The words in his
note are case-sensitive and he must use only whole words available in the magazine. He cannot
use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate
his ransom note exactly using whole words from the magazine; otherwise, print No.

 magazine= "attack at dawn"  note= "Attack at dawn"

 The magazine has all the right words, but there is a case mismatch. The answer is .
No


 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class RansomNote {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here

        Map<String, Integer> magazineWords = magazine.stream().collect(Collectors.toMap(
                word -> word,
                word -> 1, Integer::sum
        ));
        boolean b = note.stream().allMatch(noteWord -> magazineWords.computeIfPresent(noteWord, (key, value) -> value - 1)
                != null
                && magazineWords.get(noteWord) >= 0);
        System.out.println(b == true ?"Yes":"No");
    }

}