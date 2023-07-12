import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


import java.util.ArrayList;
import java.util.Arrays;

public class TextAnalyzerTest {
    @Test
    public void getWordsTest() {
        String text = "By the 1980s, cell phones and handheld game systems also employed application specific touchscreen GUIs. Newer automobiles use GUIs in their navigation systems and multimedia centers, or navigation multimedia center combinations.";
        ArrayList<String> words = new ArrayList<>(Arrays.asList("by", "the", "1980s", "cell", "phones", "and", "handheld", "game", "systems", "also", "employed", "application", "specific", "touchscreen", "guis", "newer", "automobiles", "use", "guis", "in", "their", "navigation", "systems", "and", "multimedia", "centers", "or", "navigation", "multimedia", "center", "combinations"));
        TextAnalyzer analyzer = new TextAnalyzer(text);
        assertThat(analyzer.getWords(), equalTo(words));
        //Assert.assertEquals(analyzer.getWords(), words);
    }

    @Test
    public void getMostFrequentWordTest() {
        String text = "By the 1980s, cell phones and handheld game systems also employed application specific touchscreen GUIs. Newer automobiles use GUIs in their navigation systems and multimedia centers, or navigation multimedia center combinations.";
        TextAnalyzer analyzer = new TextAnalyzer(text);
        assertThat(analyzer.getMostFrequentWord(), equalTo("and"));
        //Assert.assertEquals(analyzer.getMostFrequentWord(), "and");
        //      and/guis по 2 раза
    }
}
