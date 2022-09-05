var a = 1;
var b = a;

b = 2;
console.log(a);   // 1   이것은 복제

var a = {id:1};
var b = a;

b.id = 2
console.log(a.id);  // 2 이것이 
