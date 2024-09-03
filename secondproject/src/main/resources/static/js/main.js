//console.log('hello~');

// 화면결과용의 Vue 객체 생성
var searchResult = new Vue({
    el: '#search-result',
    data: {
        search_result: {},
    },
});




// 검색 버튼을 눌렀을 때 이벤트


$('#searchButton').click(function() {
    console.log('search btn click');

    const query = $('#searchBox').val();

    // 실제 backend에 /api/search 요청해서 데이터 가져오기(ajax)
    $.get('/api/search?searchQuery=' + query, function(response) {
        console.log('search response값', response);

        searchResult.search_result = response;
        const title = document.getElementById('wish-title');
        title.innerHTML = searchResult.search_result.title.replace(/<^>]*>?/g, '');
        $('#search-result').show();
    });
});
$('#searchBox').on('keyup', function(event) {
    if (event.key === 'Enter') {
        $('#searchButton').click();
    }
});

// 처음 페이지 로딩될 시 호출되는 jquery
$(document).ready(function() {
    console.log('jquery ready');

    $('#search-result').hide();

});
