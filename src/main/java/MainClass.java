public class MainClass {
    public static void main(String[] args) {
        XmlMessage aaa = new XmlMessage("bla bla");
        System.out.println(aaa.getName());
        aaa.prepareMessage("Alex","Fasii");
        System.out.println("body= "+aaa.getBody());
        MessageProcessor a = new MessageProcessor();
        a.printXml(aaa);
    }
}
