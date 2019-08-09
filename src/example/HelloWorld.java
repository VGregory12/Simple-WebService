package example;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.SQLException;

@WebService()
public class HelloWorld {
  @WebMethod
  public Answer sayHelloWorldFrom (@WebParam(name = "REQUEST") Integer pid) throws SQLException {
    Answer answer = new Answer();
//    String result = "Hello, world, from ";
    DBWorker.connect();
    answer = DBWorker.showPerson(pid);
//    System.out.println(result);pid
    return answer;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);
  }
}

