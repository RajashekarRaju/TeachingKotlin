package api.student1


class PopularMovies {

    val moviesList: List<Movie> = listOf(
        Movie("Ala Vaikunthapurram Lo", 1))

}

private fun main() {
    val popularMovies = PopularMovies()
    val moviesList = popularMovies.moviesList
    moviesList.forEach {
        val titleOfTheMovie = it.title
        val idOfTheMovie = it.movieId
        println("Name of the Movie is $titleOfTheMovie")
        println("Id of the Movie is $idOfTheMovie")
    }
}