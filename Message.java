package queuemessage;
public class Message {
    String copany;
    String data;
   
    public Message() {
        this.data= null;
    }
    
    public Message(String data) {
        this.data = data;
    }
    public Message(String copany, String data) {
        this.copany = copany;
        this.data = data;
    }
  
    public String getCopany() {
        return copany;
    }

    public void setCopany(String copany) {
        this.copany = copany;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    } 
}

