$(document).ready(function () {
    $("#search").click(
        function () {
            $.ajax({
                type: 'GET',
                url: 'https://api.themoviedb.org/3/search/multi',
                data: {
                    'api_key': 'fa18e82d517b980166b333c387f50a8f',
                    'query': $("#field").val()
                },
                success: function (data) {
                    let table = '<table border="1"><tr>' +
                        '<th>original_title</th>' +
                        '<th>title</th>' +
                        '<th>media_type</th>' +
                        '<th>popularity</th>' +
                        '<th>vote_count</th>' +
                        '<th>id</th>' +
                        '<th>adult</th>' +
                        '<th>original_language</th>' +
                        '<th>vote_average</th>' +
                        '<th>release_date</th>' +
                        '<th>overview</th>' +
                        '</tr>';

                    $.each(data.results, function (key, value) {
                        table += (
                            '<tr>' +
                            '<td>' + value.original_title + '</td>' +
                            '<td>' + value.title + '</td>' +
                            '<td>' + value.media_type + '</td>' +
                            '<td>' + value.popularity + '</td>' +
                            '<td>' + value.vote_count + '</td>' +
                            '<td>' + value.id + '</td>' +
                            '<td>' + value.adult + '</td>' +
                            '<td>' + value.original_language + '</td>' +
                            '<td>' + value.vote_average + '</td>' +
                            '<td>' + value.release_date + '</td>' +
                            '<td>' + value.overview + '</td>' +
                            '</tr>'
                        );
                    });
                    table += '</table>';
                    $('#tableContainer').html(table);
                },
                error: function (error) {
                    console.log(error)
                }
            }
            );
        }
    );
});

$(document).ready(function () {
    $("#clear").click(
        function () {
            document.getElementById('field').value = '';
            document.getElementById('tableContainer').innerHTML = '';
        }
    );
});