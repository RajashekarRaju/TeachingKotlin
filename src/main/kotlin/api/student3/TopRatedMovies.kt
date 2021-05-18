package api.student3

class TopRatedMovies {
   // val movie= Movie("julai")
    val moviesList:  List<Movie> = listOf(
       Movie("bahubali",4321),
   Movie("ismartshenkar",4322),
    Movie("jannu",4323)
    )
}
fun main() {
    val TopRatedMovies = TopRatedMovies()
    val moviesList = TopRatedMovies.moviesList

       moviesList.forEach {
        val titleOfTheMovie = it.title
        val idOfTheMovie = it.movieId
        println("Name of the movie is $titleOfTheMovie")
        println("Id of the movie is $idOfTheMovie")
    }
}