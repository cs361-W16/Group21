/**
 * Created by nathan on 1/22/16.
 */

$(function () {
    /**
     * Btn remove (works for all)
     */
    $("[name='btn-remove']").click(function () {
        var id = this.id;
        alert(id);
        $.ajax({
                type: "POST",
                url: "/deleteCard",
                data: JSON.stringify(id),
                contentType: "application/json; charset=utf-8",
                dataType: "json"
            })
            .done(function (data) {
                alert(data.toSource);
            })
            .fail(function () {
                alert("Ajax failed.");
            })
    });

    /**
     * Btn deal
     */
    $('#btn-deal').click(function () {
        var id = this.id;
        alert(id);
        $.ajax({
                type: "POST",
                url: "/dealCard",
                data: JSON.stringify(id),
                contentType: "application/json; charset=utf-8",
                dataType: "json"
            })
            .done(function (gamestate) {
                alert(gamestate);
            })
            .fail(function () {
                alert("Ajax failed.");
            })
    });

    /**
     * Btn start
     */
    $('#btn-rest').click(function () {
        var id = this.id;
        alert(id);
        $.ajax({
                type: "GET",
                url: "/initializeGame",
                contentType: "application/json; charset=utf-8",
                dataType: "json"
            })
            .done(function (gamestate) {
                alert(gamestate);
            })
            .fail(function () {
                alert("Ajax failed.");
            })
    });


});