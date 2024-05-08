

function showLoginForm() {
  document.getElementById('loginForm').style.display = 'block';
}

function closeLoginForm() {
  document.getElementById('loginForm').style.display = 'none';
}
// ------------------------------------------------------------------------


function myFunction() {
  var x = document.getElementById("menu")
  if (x.style.display == "block") {
    x.style.display = "none";
  }
  else {
    x.style.display = "block";
  }
}
