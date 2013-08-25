package ua.in.proskurnia.lastfm

import org.apache.http.client.RequestDirector
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.BasicResponseHandler
import org.apache.http.impl.client.DefaultHttpClient

class Worker {
  def getFriends() {
    val httpclient: HttpClient
    val httpgetfriends: HttpGet = new HttpGet("www.google.com")
  }
}