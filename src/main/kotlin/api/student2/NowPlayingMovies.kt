package api.student2
class NowPlayingMovies {
    /**
     * creating a variable movieList in NowPlayingMovies class and assigning list of movies titles and id to it
     */
    val moviesList: List<Movie> = listOf(
        Movie("Lagan",1),
        Movie("Brundavanam-colony",2),
        Movie("Premikudu",3)

    )
}


fun main() {
    /**
     * creating an object for the  NowPlayingMovies class
     * creating a variable movieList and assigning movieList to it using NowPlayingMovie object
     * using forEach for looping and printing the data
     */

    val NowPlayingMovie = NowPlayingMovies()
    val moviesList=NowPlayingMovie.moviesList


   moviesList.forEach  { movie ->
       val TitleOfTheMovie = movie.title
       val idOfTheMovie = movie.movieId
       println("Name of the movie is $TitleOfTheMovie and movie id $idOfTheMovie")
    }
}