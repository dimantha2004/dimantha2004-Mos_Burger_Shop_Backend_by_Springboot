document.getElementById('signup-form').addEventListener('submit', function (e) {
    e.preventDefault();
    const username = document.getElementById('new-username').value;
    const email = document.getElementById('new-email').value;
    const password = document.getElementById('new-password').value;

    const userDTO = {
        username: username,
        email: email,
        password: password
    };

    fetch('http://localhost:8080/api/users/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(userDTO)
    })
    .then(response => {
        if (response.ok) {
            return response.text();
        } else {
            throw new Error('Signup failed');
        }
    })
    .then(message => {
<<<<<<< HEAD
        alert(message);
        // Switch back to login form
=======
        Swal.fire({
            icon: 'success',
            title: 'Signup Successful',
            text: message
        });

>>>>>>> 3124de1 (Final Commit)
        document.querySelector('.signup-container').style.display = 'none';
        document.querySelector('.login-container').style.display = 'block';
    })
    .catch(error => {
<<<<<<< HEAD
        alert('Signup failed. Please try again.');
=======
        Swal.fire({
            icon: 'error',
            title: 'Signup Failed',
            text: 'Signup failed. Please try again.'
        });
>>>>>>> 3124de1 (Final Commit)
        console.error(error);
    });
});