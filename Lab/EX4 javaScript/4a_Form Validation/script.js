document.getElementById("myForm").addEventListener("submit", function(event) 
{
    event.preventDefault();

    const name = document.getElementById("name").value.trim();
    const regno = document.getElementById("regno").value.trim();
    const email = document.getElementById("email").value.trim();
    const year = document.getElementById("year").value.trim();
    const dept = document.getElementById("dept").value.trim();


    const errorElement = document.getElementById("error");
    errorElement.innerHTML = ""; 

    if (name === "") {
        errorElement.innerHTML = "Username is required.";
        return;
    }
    if(regno===" "){
        errorElement.innerHTML = "Register No is required.";
        return;
    }

   
    if (email==="") {
        errorElement.innerHTML = "Email is required.";
        return;
    }

    if (year==="") {
        errorElement.innerHTML = "Year is required.";
        return;
    }
    
    if (dept==="") {
        errorElement.innerHTML = "Department is required.";
        return;
    }


    alert("Form submitted successfully!");
});
