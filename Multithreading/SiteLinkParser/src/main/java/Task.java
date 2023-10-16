import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.RecursiveTask;

public class Task extends RecursiveTask<TreeSet> {

    private final static TreeSet<String> set = new TreeSet<>();
    private final String HOMEPAGE;

    public Task(String HOMEPAGE) {
        this.HOMEPAGE = HOMEPAGE;
    }

    @Override
    protected TreeSet<String> compute() {
        try {
            Thread.sleep(200);
            Document doc = Jsoup.connect(HOMEPAGE).ignoreContentType(true).ignoreHttpErrors(true).get();
            Elements links = doc.select("a[href*=/]");
            Set<Task> tasks = new HashSet<>();
            if (set.add(HOMEPAGE)) {
                for (Element element : links) {
                    String newLink = element.attr("abs:href");
                    if (newLink.endsWith("/")) {
                        newLink = newLink.substring(0, newLink.length() - 2);
                    }
                    if (!newLink.startsWith(HOMEPAGE) || newLink.contains("#")) {
                        continue;
                    }
                    Task newTask = new Task(newLink);
                    newTask.fork();
                    tasks.add(newTask);
                }
            }
            for (Task task : tasks) {
                task.join();
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return set;
    }
}
