function rotateWheel(){
    var min = 1024;
    var max = 9999;
    var deg = Math.floor(Math.random() * (max - min)) + min;
    document.getElementById('box').style.transform = "rotate("+deg+"deg)";

    var element = document.getElementById('mainbox');
    element.classList.remove('animate');

    setTimeout(function(){
        element.classList.add('animate');
      }, 5000);

//    manageEventListener();
}

//function manageEventListener() {
//    let array = document.getElementsByTagName("b")
//        for (var i = 0; i < array.length; i++) {
//            array[i].addEventListener("click", displayQuestion)
//        }
//}
//
//function removeEventListener() {
//    let array = document.getElementsByTagName("b")
//        for (var i = 0; i < array.length; i++) {
//            array[i].removeEventListener("click", displayQuestion);
//        }
//}
//
//function displayQuestion(event) {
//    console.log("hi")
//    console.log(event.target)
//    removeEventListener();
//}