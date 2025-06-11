// (Composite)
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    public FileSystemComponent getChild(int index) {
        if (index < 0 || index >= children.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return children.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent comp : children) {
            totalSize += comp.getSize();
        }
        return totalSize;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemComponent comp : children) {
            comp.print(indent + "   ");
        }
    }
}
