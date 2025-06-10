// (Leaf)
public class File implements FileSystemComponent {
    private final String name;
    private final int size;  // tamaño en bytes

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override 
    public String getName() {
        return name;
    }

    @Override 
    public int getSize() {
        return size;
    }

    @Override 
    public void print(String indent) {
        System.out.println(indent + "- File: " + name + " (" + size + " bytes)");
    }
}
