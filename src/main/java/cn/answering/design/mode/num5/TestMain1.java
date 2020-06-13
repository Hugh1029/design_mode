package cn.answering.design.mode.num5;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjp
 * @date 2020-06-13 23:33
 * @qq 34948062
 * @email hugh@answering.cn
 * @description
 *
 * 刚学习了一下怎么用Java做爬虫
 * 这边爬一个网站 12页的数据玩一下
 * 因为就12页数据数据，一页24个，就不开启多线程了
 *
 * */
public class TestMain1 {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zhangjp/workspace/log/activity.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));) {
            String url = "https://www.chinaexpo365.com/activity?pageNumber=";
            List<String> list = new ArrayList<>();
            for(int i = 1; i <= 12; i ++) {
                String activityUrl = url + i;
                Document document =  Jsoup.connect(activityUrl).get();
                Elements links = document.select("div[onclick]");
                for (Element element : links) {
                    String url1 = element.attr("abs:onclick").replace("window.open('/", "");
                    String url2 = url1.replaceAll("', '_blank'\\).location;", "");
                    list.add(url2);
                }
            }
            writer.write("活动名,活动时间,详细地址,活动地点,行业范围, 活动规模");
            writer.write(System.getProperty("line.separator"));

            // 访问页面并解析需要的数据
            for (String u : list) {
                Document doc  = Jsoup.connect(u).get();
                String title = doc.selectFirst("div.htitle").text();
                String time = doc.selectFirst("div.hinfor").selectFirst("div.inforitem").select("span").eq(1).text();
                String address1 = doc.selectFirst("div.hinfor").select("div.inforitem").eq(1).select("span").eq(1).text();
                String address2 = doc.selectFirst("div.hinfor").select("div.inforitem").eq(2).select("span").eq(1).text();
                String hangye = doc.selectFirst("div.hinfor").select("div.inforitem").eq(3).select("span").eq(1).text();
                String guimo = doc.selectFirst("div.hinfor").select("div.inforitem").eq(4).select("span").eq(1).text();
                // System.out.println(title + "--" + time + "--" + address1 + "--" + address2 + "--" + hangye + "--" + guimo);
                //writer.write("活动名: " + title + ", 活动时间: " + time + ", 详细地址: " + address1 + ", 活动地点: " + address2 + ", 行业范围: " + hangye + ", 活动规模: " + guimo + ";");
                writer.write( title + "," + time + "," + address1 + "," + address2 + "," + hangye + ", " + guimo );
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
