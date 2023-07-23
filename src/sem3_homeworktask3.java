import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sem3_homeworktask3 {
    public static &lt;T&gt; List&lt;T&gt; sortObjects(List&lt;T&gt; objects, Comparator&lt;? super T&gt; comparator) {
            Collections.sort(objects, comparator);
            return objects;
        }
    }
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List&lt;String&gt; names = new ArrayList&lt;&gt;();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");

            Comparator&lt;String&gt; lengthComparator = Comparator.comparingInt(String::length);

            List&lt;String&gt; sortedNames = SortingUtils.sortObjects(names, lengthComparator);

            System.out.println(sortedNames); // Выводит: [Bob, Alice, David, Charlie]
        }
    }


