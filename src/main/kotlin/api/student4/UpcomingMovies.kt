package api.student4

/**
 *
 */

class UpcomingMovies {

    //Declaring a variable to access to data class which is Movie
    //There are numbers of movies to access so,using list
    val moviesList: List<Movie> = listOf(
        //initializing values for the parameters in data class
        Movie("Radhe", 1234),
        Movie("Red", 1235),
        Movie("RRR",1236)
    )
}

fun main() {

    //Declaring a variable to get data in the UpcomingMovies class
    val upcomingMovies = UpcomingMovies()

    //Declaring a variable to access the data in the UpcomingMovies class
    val moviesList = upcomingMovies.moviesList

    //using forEach loop printing the data
    moviesList.forEach {
        val titleOfTheMovie = it.title
        val idOfTheMovie = it.movieId
        println("Name of the Movie is $titleOfTheMovie")
        println("Id of the Movie is $idOfTheMovie")
    }

}