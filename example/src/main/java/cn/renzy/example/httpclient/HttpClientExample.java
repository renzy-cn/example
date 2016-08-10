package cn.renzy.example.httpclient;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class HttpClientExample {

	public String httpGet(URI uri){
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpGet httpGet = new HttpGet(uri);
		
		try {
			HttpResponse response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			return "请求异常";
		}
		
	}
	
	public String httpGet(String uri){
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpGet httpGet = new HttpGet(uri);
		
		try {
			HttpResponse response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			return "请求异常";
		}
		
	}
	
	public String httpPost(URI uri){
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpPost httpPost = new HttpPost(uri);
		
		try {
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			return "请求异常";
		}
	}
	
	public String httpPost(String uri){
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpPost httpPost = new HttpPost(uri);
		
		try {
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			return "请求异常";
		}
	}
	
	
}
