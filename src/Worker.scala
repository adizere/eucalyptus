import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.RequestDirector
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.BasicResponseHandler
import org.apache.http.impl.client.DefaultHttpClient

class Worker {
	val config = new Config()
	def getFriends() = {
	    val page : Int = 1
	    val totalpages : Int = 1
	    
	    
	    do {
			val httpclient : HttpClient = new DefaultHttpClient()
			val httpgetfriends : HttpGet = new HttpGet(config.GET_FRIENDS + "toluolll" + config.PAGE + page)
		    	
			val response : HttpResponse = httpclient.execute(httpgetfriends)
		    val entity : HttpEntity = response.getEntity()
		    println(entity.getContent().toString())
	    } while (page <= totalpages)
	}
}