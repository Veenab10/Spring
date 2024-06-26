function firstNameValidation() {
    var fNameInput = document.getElementById("fname").value;
    var fNameError = document.getElementById("nameError");
    var sendButton = document.getElementById("submitBtn");
   var nameRegex = /^[A-Za-z]+$/;

    if ( fNameInput !=null && fNameInput.length >= 4 && fNameInput.length <= 20 && nameRegex.test(nameInput)) {
        fNameError.innerHTML = "Entered name is correct";
        fNameError.style.color = 'green';
        sendButton.removeAttribute("disabled");
    }
    else {
        fNameError.innerHTML = "Entered value is incorrect. Name must be between 4 and 20 characters.";
        fNameError.style.color = 'red';
        sendButton.setAttribute("disabled", "");
    }
}
