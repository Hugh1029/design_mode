package cn.answering.design.mode.num2.observe;

/**
 * @author zhangjp
 * @date 2020-05-08 23:07
 * @qq 34948062
 * @github: https://github.com/Hugh1029
 * @web: https://answering.cn
 * @description
 */
public class TestMain {

    public static void main(String[] args) {
        MessageData messageData = new MessageData();
        BroadcastObserver broadcastObserver = new BroadcastObserver();
        TVObserver tvObserver = new TVObserver();
        NewsPaperObserver newsPaperObserver = new NewsPaperObserver();
        messageData.addObserver(broadcastObserver);
        messageData.addObserver(tvObserver);
        messageData.addObserver(newsPaperObserver);

        messageData.productMessage("今夜有大到暴雨----->");

        messageData.productMessage("LZX有新闻了，快来吃瓜--->");

        messageData.productMessage("阿娇离婚了--->");
    }
}
