function logout(){
    // apaga cook
    localStorage.removeItem("userLogged")
    // retorna para pagina login
    window.location  = "index.html";
}

function detail(){
    // retorna para pagina dash
    window.location  = "dash.html";
}