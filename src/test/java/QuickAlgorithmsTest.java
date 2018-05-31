import com.algorithms.QuickAlgorithms;
import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class QuickAlgorithmsTest {

    // repeating for executing time comparison
    private static final int REPEAT = 10000;

    @Test
    @Repeat(value = REPEAT)
    public void quickUnion() {
        List<String> result = QuickAlgorithms.quickUnion(getTestPairs());

        Assert.assertEquals(getExpectedPairs(), result);
    }

    @Test
    @Repeat(value = REPEAT)
    public void quickSearch() {
        List<String> result = QuickAlgorithms.quickSearch(getTestPairs());

        Assert.assertEquals(getExpectedPairs(), result);
    }

    private List<String> getTestPairs() {
        List<String> list = new ArrayList<String>();
        list.add("3-4");
        list.add("4-9");
        list.add("8-0");
        list.add("2-3");
        list.add("5-6");
        list.add("2-9");
        list.add("5-9");
        list.add("7-3");
        list.add("4-8");
        list.add("5-6");
        list.add("0-2");
        list.add("6-1");

        return list;
    }

    private List<String> getExpectedPairs() {
        List<String> list = new ArrayList<String>();
        list.add("3-4");
        list.add("4-9");
        list.add("8-0");
        list.add("2-3");
        list.add("5-6");
        list.add("5-9");
        list.add("7-3");
        list.add("4-8");
        list.add("6-1");

        return list;
    }
}