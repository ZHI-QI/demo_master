
var menuId = $("#menuId").text();
new Yox({
    el: '#app1',
    template: '#template1',
    data: {
        username: menuId,
    }
})