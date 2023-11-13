let selectedMovie;

const fetchMovieData = async (e) => {
    e.preventDefault();
    const movieDataContainer = document.getElementById('movie-data');

    // Replace the following URL with the API endpoint that provides movie data.
    const apiUrl = `https://api.example.com/movies/${selectedMovie}`;

    try {
        const response = await fetch(apiUrl);
        const movieData = await response.json();

        movieDataContainer.innerHTML = `
            <h2>${movieData.title}</h2>
            <p>Director: ${movieData.director}</p>
            <p>Release Date: ${movieData.releaseDate}</p>
            <p>Genre: ${movieData.genre}</p>
            <!-- Add more movie details as needed -->
        `;
    } catch (error) {
        movieDataContainer.innerHTML = '<p>Movie data not available.</p>';
    }
}

const handleSelect = (e) => {
    selectedMovie = e.target.value;
}
