import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.RequestDirector
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.BasicResponseHandler
import org.apache.http.impl.client.DefaultHttpClient

object lastfm extends App {	
	val worker = new Worker
	worker.getFriends();
}