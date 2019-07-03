
function getWeather(){
  var city = "dallas";
  $.get(
    "http://api.openweathermap.org/data/2.5/weather?q=" +
      city +
      "&units=imperial&appid=27679bc58283914c54a690c2f4b9e808",
    function(data) {
      console.log(data);

      var temp = data.main.temp;

      var temp = data.main.temp;
      var humidity = data.main.humidity;
      var temp_max= data.main.temp_max;
      var temp_min = data.main.temp_min;
      document.getElementById("temp1").innerHTML = "Today's weather is : "+temp;
      document.getElementById("temp2").innerHTML = "Today's humidity is : "+humidity;
      document.getElementById("temp3").innerHTML = "Today's High temperature is : "+ temp_max;
       document.getElementById("temp4").innerHTML = "Today's Low temperature is : "+ temp_min;
    }
  );
};