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
                alert(data);
            })
            .fail(function () {
                alert("Ajax failed.");
            })
    });

});