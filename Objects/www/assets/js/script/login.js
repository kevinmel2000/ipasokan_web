$('#btn-clear').click(function() {
	$('#username').val('');
	$('#password').val('');
});

function login(){
	if ($('#username').val()=='') {
		alert('Username harus diisi!');		
	}else
	if ($('#password').val()=='') {
		alert('Password harus diisi!');		
	}else{
		window.location = "admin";		
	}
}
