package javabasic.exgson;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

//개인실습 1)
//https://jsonplaceholder.typicode.com/posts 에서 JSON문자열을 수신하여
//List에 저장한 후 id값에 대해 내림차순 정렬해서 출력

public class ExGson1 {

	public static void main(String[] args) {

		String uriStr = "https://jsonplaceholder.typicode.com/posts";

		try {
			URI uri = new URI(uriStr);
			URL url = uri.toURL();

		} catch (URISyntaxException urise) {
			urise.printStackTrace();
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		}
		
		
		
		List<Post> postList = gson.fromJson(jsonStr, new TypeToken<List<Post>>() {
		}.getType());

		// id 내림차순 정렬
		Collections.sort(postList, new Comparator<Post>() {
			@Override
			public int compare(Post post1, Post post2) {
				return Integer.parseInt(post2.getId()) - Integer.parseInt(post1.getId());
			}
		});

		
		
	}// m

}// c
