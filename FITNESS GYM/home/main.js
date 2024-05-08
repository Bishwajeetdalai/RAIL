

function showLoginForm() {
  document.getElementById('loginForm').style.display = 'block';
}

function closeLoginForm() {
  document.getElementById('loginForm').style.display = 'none';
}

// -----FORM BUTTON-----
let closeBtn = document.querySelector('.closeBtn')

function openform() {
  document.getElementById('form1').style.display = 'block';
}
function closeform() {
  document.getElementById('form1').style.display = 'none';
}
document.getElementById('openformBtn').addEventListener('click', openform);

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

