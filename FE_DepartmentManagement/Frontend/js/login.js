$(function() {
    var isRememberMe = storage.getRememberMe();
    document.getElementById("rememberMe").checked = isRememberMe;

});



function login() {
    // get username & password
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    //validate 
    if (!username) {
        showNameErrorMessage("Please input username!");
        return;
    }
    if (!password) {
        showNameErrorMessage("Please input password!");
        return;
    }

    //validate 6 --> 50 characters
    if (username.length < 6 || username.length > 50 || password.length < 6 || password.length > 50) {
        // show error message
        showNameErrorMessage("Login failed!");
        return;
    }


    // call API
    $.ajax({
        url: "http://localhost:8080/api/v1/login",
        type: 'GET',
        contentType: "application/json",
        dataType: 'json', // dataType return 
        beforeSend: function(xhr) {
            xhr.setRequestHeader("Authorization", "Basic" + " " + btoa(username + ":" + password));
        },
        success: function(data, textStatus, xhr) {

            // save remember me
            var isRememberMe = document.getElementById("rememberMe").checked;
            storage.saveRememberMe(isRememberMe);

            // save data 
            storage.setItem("ID", data.id);
            storage.setItem("FULL_NAME", data.fullName);
            storage.setItem("USERNAME", username);
            storage.setItem("PASSWORD", password);
            storage.setItem("ROLE", data.role);


            window.location.replace("http://127.0.0.1:5500/html/program.html");
        },
        error(jqXHR, textStatus, errorThrown) {
            if (jqXHR.status == 401) {
                showNameErrorMessage("Login Failed!")
            } else {
                console.log(jqXHR);
                console.log(textStatus);
                console.log(errorThrown);
            }
        }
    });
}

function showNameErrorMessage(message) {
    document.getElementById("nameErrorMessage").style.display = "block";
    document.getElementById("nameErrorMessage").innerHTML = message;
}

function hideNameErrorMessage() {
    document.getElementById("nameErrorMessage").style.display = "none";

}