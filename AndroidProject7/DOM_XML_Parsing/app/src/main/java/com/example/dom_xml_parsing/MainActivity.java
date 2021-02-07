package com.example.dom_xml_parsing;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dom_xml_parsing.R;
public class MainActivity extends Activity {
    TextView textview;
    Document doc = null;
    LinearLayout layout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textview);
    }
    public void onClick(View view){
        GetXMLTask task = new GetXMLTask();
        task.execute("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=61&gridy=125");
    }
    private class GetXMLTask extends AsyncTask<String, Void, Document>{
        @Override
        protected Document doInBackground(String... urls) {
            URL url;
            try {
                url = new URL(urls[0]);
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder(); //XML문서 빌더 객체를 생성
                doc = db.parse(new InputSource(url.openStream())); //XML문서를 파싱한다.
                doc.getDocumentElement().normalize();

            } catch (Exception e) {
                Toast.makeText(getBaseContext(), "Parsing Error", Toast.LENGTH_SHORT).show();
            }
            return doc;
        }
        @Override
        protected void onPostExecute(Document doc) {
            String s = "";
            NodeList nodeList = doc.getElementsByTagName("data");
            for(int i = 0; i< nodeList.getLength(); i++){
                s += "" +i + ": 날씨 정보: ";
                Node node = nodeList.item(i);
                Element fstElmnt = (Element) node;
                NodeList nameList  = fstElmnt.getElementsByTagName("temp");
                Element nameElement = (Element) nameList.item(0);
                nameList = nameElement.getChildNodes();
                s += "온도 = "+ ((Node) nameList.item(0)).getNodeValue() +" ,";
                NodeList websiteList = fstElmnt.getElementsByTagName("wfKor");
                s += "날씨 = "+  websiteList.item(0).getChildNodes().item(0).getNodeValue() +"\n";
            }
            textview.setText(s);
            super.onPostExecute(doc);
        }
    }
}

