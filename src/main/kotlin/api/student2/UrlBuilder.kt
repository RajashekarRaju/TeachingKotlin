package api.student2

import org.json.JSONObject
import java.net.URL
import java.util.*
import javax.net.ssl.HttpsURLConnection
import kotlin.collections.ArrayList

val requestUrl = "https://api.themoviedb.org/3/movie/upcoming?api_key="

fun fetchJsonData(jsonResponse: String): List<Movie> {
    val movieList: MutableList<Movie> = ArrayList()
    val baseObject = JSONObject(jsonResponse)
    val baseArray = baseObject.getJSONArray("results")
    for (index in 0 until baseArray.length()) {
        val finalObject = baseArray.getJSONObject(index)
        val id: Int = finalObject.getInt("id")
        val titleOfTheMovie: String = finalObject.getString("title")
        val movie = Movie(titleOfTheMovie, id)
        movieList.add(movie)
    }

    return movieList
}

fun movieResponse(): String {
    val requestUrl = URL(requestUrl)
    return getResponseFromHttpUrl(requestUrl)
}

fun getResponseFromHttpUrl(requestUrl: URL): String {

    val httpsURLConnection: HttpsURLConnection = requestUrl.openConnection() as HttpsURLConnection
    var response = ""

    try {
        val inputStream = httpsURLConnection.inputStream
        val scanner = Scanner(inputStream)
        scanner.useDelimiter("\\A")
        if (scanner.hasNext()) {
            response = scanner.next()
        }
        scanner.close()
    } catch (e: Exception) {
        println(e)
    } finally {
        httpsURLConnection.disconnect()
    }

    return response
}
