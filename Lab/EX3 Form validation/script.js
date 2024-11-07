document.getElementById("myForm").addEventListener("submit", function(event) 
{
    event.preventDefault();

    const username = document.getElementById("name").value.trim();
    // const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();

    const errorElement = document.getElementById("error");
    errorElement.innerHTML = ""; 

    if (username === "") {
        errorElement.innerHTML = "Username is required.";
        return;
    }
    if(password===""){
        errorElement.innerHTML = "Password is required.";
        return;
    }

   
    if (password.length < 6) {
        errorElement.innerHTML = "Password must be at least 6 characters long.";
        return;
    }

    alert("Form submitted successfully!");
});
