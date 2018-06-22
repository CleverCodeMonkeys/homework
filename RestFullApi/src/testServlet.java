

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;



/**
 * Servlet implementation class testServlet
 */
@WebServlet("/rest.do")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tmx = "244148.546388";
		String tmY = "412423.75772";
		String pageNo = "1";
		String numofRow = "10";
		String key ="nFWwfKkMJwNGIz3E7Po8McwXcb78ecGgM9iK2pRZPIiXUjHFqa4gStqTwAsl5Caud4n8FZhmcWEBS1cmO%2FqHRg%3D%3D";
		Node seoul = null;
		
		String url = "http://openapi.airkorea.or.kr/openapi/services/rest/MsrstnInfoInqireSvc/getNearbyMsrstnList?tmX=" +
		tmx + "&tmY=" + tmY + "&pageNo=" + pageNo + "&numOfRows=" + numofRow + "&ServiceKey=" +key;
		url = "http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnMesureLIst?serviceKey=nFWwfKkMJwNGIz3E7Po8McwXcb78ecGgM9iK2pRZPIiXUjHFqa4gStqTwAsl5Caud4n8FZhmcWEBS1cmO%2FqHRg%3D%3D&numOfRows=10&pageSize=10&pageNo=1&startPage=1&itemCode=PM10&dataGubun=HOUR&searchCondition=MONTH";
		URL obj = new URL(url);
		System.out.println(obj.getProtocol());
		System.out.println(obj.getPath());
		HttpURLConnection con = (HttpURLConnection)obj.openConnection();
		con.setRequestMethod("GET");
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer respond = new StringBuffer();
		
		while((inputLine = in.readLine()) != null)
		{
			System.out.println(inputLine);
			respond.append(inputLine);
		}
		in.close();
		
//		try{
//			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//			
//			FileOutputStream output = new FileOutputStream("./PM10");
//			output.write(respond.toString().getBytes());
//			output.close();
//			
//			Document doc = dBuilder.parse("./PM10");
//			doc.getDocumentElement().normalize();
//			
//			Element body = (Element)doc.getElementsByTagName("body").item(0);
//			System.out.println(body.getNodeValue());
//			Element items = (Element)doc.getElementsByTagName("items").item(0);
//			System.out.println(items.getNodeValue());
//			Element item = (Element)doc.getElementsByTagName("seoul").item(0);
//			seoul = item.getElementsByTagName("seoul").item(0);
//			
//			System.out.println(seoul.getNodeName());
//			System.out.println(seoul.getNodeValue());
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
