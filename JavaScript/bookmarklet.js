var info = function() {
	var result;
	var objimg = $("body").find("img");
	var img_big;
	var area = 0;
	$("img").each(function (index, item) {
		if (item.width * item.height > area) {
			area = item.width * item.height;
			img_big = item;
		}
	});
	var title = $("body").find("h1:first");
	result = {
		"location":window.location.href,
		"title":$(title).text(),
		"img_src":$(img_big).attr("src")
		}

	return result;
}

$.ajax({
	method:"get",
	url:"http://webdev-2013.heroku.com/bucket/:19/add",
	dataType: "jsonp",
	data: info()
});
