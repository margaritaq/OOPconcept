public class XmlMessage implements MEssage {
    private String name = "XML";
    private String body;

    public XmlMessage() {
    }

    public XmlMessage(String body) {
        this.body = body;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void prepareMessage() {
        System.out.println("NO message");
    }

    public void prepareMessage(String a) {
        System.out.println(a);
    }

    public void prepareMessage(String a, String b) {
        System.out.println(a + " " + b);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
