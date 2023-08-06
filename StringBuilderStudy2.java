import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringBuilderStudy2 {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> wordFrequencyMap = new LinkedHashMap<>();

        // 단어 입력 받기
        System.out.println("원하시는 단어를 입력하세요 : )");
        String input;
        while(!(input = sc.nextLine()).isEmpty()) {
            String[] words = input.split("\\s+"); // 공백을 기준으로 단어 분리
            for (String word : words) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(words, 0) + 1);
            }
        }
        sc.close();

        // 단어들을 중복 없이 오름차순으로 정렬하여 StringBuilder에 추가
        StringBuilder stringBuilder = new StringBuilder();
        Set<String> sortedWords = new TreeSet<>(wordFrequencyMap.keySet());
        for (String word : sortedWords) {
            int frequency = wordFrequencyMap.get(word);
            stringBuilder.append(word).append(" (").append(frequency).append(" times)").append("\n");
        }

        // 결과 출력
        System.out.println("단어들의 오름차순 정렬 및 빈도수 출력 : ");
        System.out.println(stringBuilder.toString());

    }
}
