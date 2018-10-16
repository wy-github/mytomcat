import java.io.IOException;

public class MyServlet  {
    public void doGet(MyRequest myRequest,MyResponse myResponse){
        try{
            myResponse.write(" get Hello World");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void doPost(MyRequest myRequest,MyResponse myResponse){
        try{
            myResponse.write(" post Hello World");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

  public  void service(MyRequest myRequest,MyResponse myResponse){
          if(myRequest.getMethod().equalsIgnoreCase("post")){
            doPost(myRequest,myResponse);
          }else if(myRequest.getMethod().equalsIgnoreCase("get")){
              doGet(myRequest,myResponse);
          }
  }

}
