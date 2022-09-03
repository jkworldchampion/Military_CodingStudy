var arr = []
for(var i = 0; i < 5; i++){
    arr[i] = function(id) {
        return function(){   // 이렇게 해줘야 0부터 4까지 잘 들어간다.
            return id;
        }
    }(i);
}
for(var index in arr) {
    console.log(arr[index]());
}
