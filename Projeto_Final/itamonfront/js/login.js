function carregarUsuario(){
    var usuarioJson = localStorage.getItem("logado");
    if(!usuarioJson){
        window.location = 'index.html';
    }

    var usuario = JSON.parse(usuarioJson);

    document.getElementById('nome').innerText = usuario.nomeUsuario;
    document.getElementById('racf').innerText = usuario.racf;
    document.getElementById('funcional').innerText = usuario.funcional;
    document.getElementById('foto-usuario').src = "../imagens/" + usuario.fotoUsuario;
}
function logout(){
    localStorage.removeItem("logado");
    window.location="index.html"; 

}

function logar() {
    var carta = { 
        funcional: document.getElementById("txtusuario").value, 
        racf: document.getElementById("txtusuario").value, 
        senhaUsuario: document.getElementById("txtsenha").value 
    }


    var envelope = { 
        method: "POST", body: JSON.stringify(carta), 
        headers: { 
            "Content-type": "application/json" 
        } 
    }


    fetch("http://localhost:8080/login", envelope)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("logado", JSON.stringify(res));
            window.location="operacao.html"; 
            //window.location("oi")
        })
        .catch(err => { 
            window.alert("Não foi possível logar"); 
        });


}