package ma.hibernate.embeddable.model;

public class PostMetadata {
    private long size; // in bytes
    private String hashSum;

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getHashSum() {
        return hashSum;
    }

    public void setHashSum(String hashSum) {
        this.hashSum = hashSum;
    }
}
