window.onload = function (){
  var tabs = this.document.getElementById("tabs");
  var ul = tabs.getElementsByTagName("ul")[0];
  var li = ul.getElementsByTagName("li");
  var div = tabs.getElementsByTagName("div");

  for(var i = 0, ln = li.length;i < ln;i ++){
    li[i].tabIndex = i;
    li[i].onclick = function () {
      for(var j = 0;j < ln;j ++){
        li[j].className = "";
        div[j].className = 'hide';
      }
      this.className = "on";
      alert(this.tabIndex);
      div[this.tabIndex].className = "";
    }
  }
}