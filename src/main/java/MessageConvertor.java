public class MessageConvertor {
    public JsonMessage parsXmlToJson(XmlMessage a){
        return new JsonMessage(a.getBody());
    }
    public XmlMessage parsJsonToXml(JsonMessage a){
        return new XmlMessage(a.getBody());
    }
}
