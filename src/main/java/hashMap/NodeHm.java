package hashMap;

/**
 * Created by mahes on 5/26/2017.
 */
public class NodeHm {
    String key;
    String value;
    NodeHm next;

    public NodeHm(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {

        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public NodeHm getNext() {
        return next;
    }

    public void setNext(NodeHm next) {
        this.next = next;
    }
}
