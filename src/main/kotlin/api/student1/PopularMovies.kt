package api.student1

import fetchJsonData
import movieResponse


class PopularMovies {

    val moviesList: List<Movie> = fetchJsonData(movieResponse())

}

fun main() {

    val PopularMovies = PopularMovies()
    val moviesList = PopularMovies.moviesList

    moviesList.forEach {
        val titleOfTheMovie = it.title
        val idOfTheMovie = it.movieId
        println("Name of the Movie is $titleOfTheMovie")
        println("Id of the Movie is $idOfTheMovie")
    }
}