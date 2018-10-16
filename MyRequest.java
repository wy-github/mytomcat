import java.io.IOException;
import java.io.InputStream;
//封装请求对象,通过输入流，对 HTTP 协议进行解析，拿到 HTTP 请求头的方法以及 URl
public class MyRequest {
    private String url;
    private String method;

    public MyRequest(InputStream inputStream) throws IOException {
        String httpRequest = " ";
        byte[] httpRequestBytes = new byte[1024];
        int length;

        if ((length = inputStream.read(httpRequestBytes)) > 0) {
            httpRequest = new String(httpRequestBytes, 0, length);
        }

        String httpHead = httpRequest.split("\n")[0];
        url = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
