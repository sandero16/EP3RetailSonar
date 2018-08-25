

// Below function Executes on click of login button.
function validate(){
var username = document.getElementById("uname").value;
var password = document.getElementById("psw").value;
if ( username == "p" && password == "p"){

window.location = "/RetailSonarWeb/client/Dashboard-client.xhtml"; // Redirecting to other page.
return false;
}
else if(username == "q" && password == "q"){
window.location = "/RetailSonarWeb/admin/Dashboard-admin.xhtml"; // Redirecting to other page.
return false;
}
else{
	alert("Wrong Username or Password");
}
}

