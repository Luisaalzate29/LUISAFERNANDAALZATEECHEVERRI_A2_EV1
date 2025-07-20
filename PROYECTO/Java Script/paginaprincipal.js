function showForm(formId) {
      document.getElementById('inicioForm').classList.add('hidden');
      document.getElementById('registroForm').classList.add('hidden');
      document.getElementById('recuperarForm').classList.add('hidden');
      document.getElementById(formId + 'Form').classList.remove('hidden');
    }

    document.getElementById('loginForm').addEventListener('submit', function(event) {
      event.preventDefault();
      const usuario = document.getElementById('loginUsuario').value.trim();
      const password = document.getElementById('loginPassword').value.trim();
      const errorMsg = document.getElementById('loginErrorMsg');

      if (usuario === '' || password === '') {
        errorMsg.textContent = 'Por favor ingrese usuario y contraseña.';
      } else {
        errorMsg.textContent = '';
        alert('Inicio de sesión exitoso.');
      }
    });

    document.getElementById('registerForm').addEventListener('submit', function(event) {
      event.preventDefault();
      const usuario = document.getElementById('Identificación').value.trim();
      const password = document.getElementById('registerPassword').value.trim();
      const errorMsg = document.getElementById('registerErrorMsg');

      if (usuario === '' || password === '') {
        errorMsg.textContent = 'Por favor ingrese usuario y contraseña.';
      } else {
        errorMsg.textContent = '';
        alert('Registro exitoso.');
      }
    });

    document.getElementById('recoverForm').addEventListener('submit', function(event) {
      event.preventDefault();
      const usuario = document.getElementById('recoverUsuario').value.trim();
      const newPassword = document.getElementById('newPassword').value.trim();
      const errorMsg = document.getElementById('recoverErrorMsg');

      if (usuario === '' || newPassword === '') {
        errorMsg.textContent = 'Por favor ingrese usuario y nueva contraseña.';
      } else {
        errorMsg.textContent = '';
        alert('Contraseña recuperada exitosamente.');
      }
    })