document.getElementById('togglePassword').addEventListener('click', function () {
    const passwordField = document.getElementById('senha');
    const type = passwordField.getAttribute('type') === 'password' ? 'text' : 'password';
    passwordField.setAttribute('type', type);
    this.textContent = type === 'password' ? 'Mostrar' : 'Esconder';
});

document.getElementById('loginForm').addEventListener('submit', function (e) {
    e.preventDefault();
    const nome = document.getElementById('nome').value;
    localStorage.setItem('nomeUsuario', nome);
    window.location.href = 'pagina-principal.html'; // Redireciona para a página principal
});