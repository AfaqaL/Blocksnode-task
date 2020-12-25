import java.util.*;

public class StringDistributor {

    private Map<Character, List<String>> container;
    private String representation;

    public StringDistributor(String line){
        container = new HashMap<>(26);
        StringTokenizer tokenizer = new StringTokenizer(line);
        while(tokenizer.hasMoreTokens()) {
            String currToken = tokenizer.nextToken().toLowerCase();
            char key = currToken.charAt(0);
            container.putIfAbsent(key, new ArrayList<>());
            container.get(key).add(currToken);

        }
        representation = container.toString();
    }

    public void display(){
        System.out.println(representation);
    }

    public static void main(String[] args) {
        for (String line: args) {
            StringDistributor strDist = new StringDistributor(line);
            strDist.display();
        }
    }
}
