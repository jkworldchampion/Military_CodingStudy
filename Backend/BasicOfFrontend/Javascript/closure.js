function outter(){
  var title = 'coding everybody';
  return function(){
    alert(title);
  }
}
inner = outter();
inner();  // 여기서 신기하게도 codong everybody가 출력됨
