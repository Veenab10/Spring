function nameValidation() {
    var nameInput = document.getElementById("name").value;
    var nameError = document.getElementById("nameError");
    var sendButton = document.getElementById("submitBtn");
   var nameRegex = /^[A-Za-z]+$/;

    if ( nameInput !=null && nameInput.length >= 4 && nameInput.length <= 20 && nameRegex.test(nameInput)) {

//         nameError.innerHTML = "Entered name is correct";
//         nameError.style.color = 'green';
        sendButton.removeAttribute("disabled");
    }
    else {
        nameError.innerHTML = "Entered value is incorrect. Name must be between 4 and 20 characters.";
        nameError.style.color = 'red';
        sendButton.setAttribute("disabled", "");
    }
}

function rollNoValidation()
{
    var rollNoInput = document.getElementById("rollNo").value;
    var rollNoError = document.getElementById("rollNoError");
    var sendButton = document.getElementById("submitBtn");
    var rollNoRegex = /^[A-Za-z0-9]+$/;

        if ( rollNoInput !=null && rollNoInput.length >= 4 && rollNoInput.length <= 10 && rollNoRegex.test(rollNoInput)) {
//            rollNoError.innerHTML = "Entered roll number is correct";
//            rollNoError.style.color = 'green';
            sendButton.removeAttribute("disabled");
        }
        else {
            rollNoError.innerHTML = "Entered value is incorrect. Roll Number must be between 4 and 10 characters.";
            rollNoError.style.color = 'red';
            sendButton.setAttribute("disabled", "");
        }

}

function collegeNameValidation()
{
    var collegeName=document.getElementById("collegeName")
    console.log(collegeName.value)
    var sendButton = document.getElementById("submitBtn");
    var collegeNameError = document.getElementById("collegeNameError");

    	if(collegeName.value=="")
    	{
    		console.log("Please Select college name")
    		var collegeNameError=document.getElementById("collegeNameError")
    		collegeNameError.innerHTML="Please Select college name "
    		collegeNameError.style.color='red'
    		sendButton.setAttribute("disabled", "");

    	}
    	else{
//    	collegeNameError.innerHTML = "Entered college name is correct";
//        collegeNameError.style.color = 'green';
        sendButton.removeAttribute("disabled");
    	}
}

function validateForm() {
            var genderElements = document.getElementsByName("gender");
            var genderSelected = false;
            var checkbox = document.getElementById("check");
            var sendButton = document.getElementById("submitBtn");
            var genderError = document.getElementById("genderError");
            var checkboxError = document.getElementById("checkboxError");

            for (var i = 0; i < genderElements.length; i++) {
                if (genderElements[i].checked) {
                    genderSelected = true;
                    break;
                }
            }

            if (!genderSelected) {
                console.log("Please select a gender");
                genderError.innerHTML = "Please select a gender";
                genderError.style.color = 'red';
            } else {
//                genderError.innerHTML = "gender selected";
//                genderError.style.color = 'green';

            }

            if (!checkbox.checked) {
                console.log("Please confirm the information is correct");
                checkboxError.innerHTML = "Please confirm the information is correct";
                checkboxError.style.color = 'red';
            } else {
//                checkboxError.innerHTML = "Information confirmed";
//                 checkboxError.style.color = 'green';
            }

            if (genderSelected && checkbox.checked) {
                sendButton.removeAttribute("disabled");
            } else {
                sendButton.setAttribute("disabled", "");
            }
        }

