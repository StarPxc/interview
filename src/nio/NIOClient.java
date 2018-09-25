package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 浦希成
 * 2018/9/25 22:30
 * https://www.bilibili.com/video/av31532039?p=4 未完
 */
public class NIOClient {
    private int flag=0;
    private int blockSize = 4096;
    /**
     * 发送数据的缓冲区
     */
    private ByteBuffer sendBuffer = ByteBuffer.allocate(blockSize);
    /**
     * 接受数据的缓冲区
     */
    private ByteBuffer receiverBuffer = ByteBuffer.allocate(blockSize);
    private final static InetSocketAddress serverAddress=new InetSocketAddress("127.0.0.1",7080);

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel=SocketChannel.open();
        socketChannel.configureBlocking(false);
        Selector selector=Selector.open();
        socketChannel.register(selector, SelectionKey.OP_CONNECT);
        socketChannel.connect(serverAddress);
        Set<SelectionKey> selectionKeys=selector.selectedKeys();
        SocketChannel client;
        String receiveText;
        String sendText;
        for (SelectionKey key : selectionKeys) {
            if (key.isConnectable()) {
                System.out.println("client connect");

            }
        }
    }
}
