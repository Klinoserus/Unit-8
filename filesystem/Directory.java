import java.util.HashSet;

public class Directory implements Entry {

    public String name;
    public Directory parentDirectory;
    public HashSet<String> entryList;
}
