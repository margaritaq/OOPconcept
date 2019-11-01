public class MessageProcessor {
    public void printXml(XmlMessage a){
        System.out.println(a.getName()+"body: "+ a.getBody());
    }
    public void printJson(JsonMessage a){
        System.out.println(a.getName()+"body: "+ a.getBody());
    }
}
