package day15.java2;

import javax.xml.ws.Service;

/*
* 代理模式（Proxy）
* 接口的应用：代理模式
* */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}
interface NetWork{
public void browse();
}

class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

class ProxyServer implements NetWork{
    private NetWork work;
    //构造器
    public ProxyServer(NetWork work){
        this.work = work;
    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}
