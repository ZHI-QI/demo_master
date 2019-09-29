$(function() {
    $.ajax({
        type: "POST",
        url:"/collect/collect",
        data:$("#collect-form").serialize(),
        success: function(response) {
            if (response.code == 0){
                new Yox({
                    el: '#app',
                    template: '#template',
                    data: {
                        user: response.data,
                    }
                });
            }
        }
    });

});