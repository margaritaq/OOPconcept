public class MainClass {
    public static void main(String[] args) {
        XmlMessage xmlMessage = new XmlMessage("Super message");
        System.out.println(xmlMessage.getName());
        xmlMessage.prepareMessage("Alex", "Fasii");
        System.out.println("body= " + xmlMessage.getBody());
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.printMessage(xmlMessage);
    }
}
