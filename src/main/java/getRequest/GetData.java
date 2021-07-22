package getRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	public void testResponseCode()
	{
	Response res = RestAssured.get("https://api.openweathermap.org/data/2.5/weather?appid={openweathermap_apikey}&q=chicago");
	int code = res.getStatusCode();
	Assert.assertEquals(code,200);
	}
	public void getString()
	{
	Response res = RestAssured.get("https://api.openweathermap.org/data/2.5/weather?appid={openweathermap_apikey}&q=chicago");
	String data = res.asString(); 
	System.out.println(data);
	}
	
}
