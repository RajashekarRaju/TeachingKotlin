package api.student3

class TopRatedMovies {
    val moviesList: List<Movie> = fetchJsonData(movieResponse())
 }
 private fun main() {
    val TopRatedMovies = TopRatedMovies()
    val moviesList = TopRatedMovies.moviesList

       moviesList.forEach {
        val titleOfTheMovie = it.title
        val idOfTheMovie = it.movieId
        println("Name of the movie is $titleOfTheMovie")
        println("Id of the movie is $idOfTheMovie")
    }
}