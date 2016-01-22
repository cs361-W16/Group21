/**
 * Created by nathan on 1/22/16.
 */

$(function(){
    /**
     * Btn Column One (remove)
     */
    $("[name='btn-remove']").click(function(){
        var id = this.id;
        alert(id);
        $.ajax({
            type: "POST",
            url : "/deleteCard",
            data: JSON.serialize(id)
        })
            .done(function(){
                alert("Success");
            })
            .fail(function(){
                alert("Ajax failed.");
            })
    });

});