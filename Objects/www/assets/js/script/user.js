$('#list_user').DataTable();

function tambah_user() {
	$('#form_input_user').show();
}
function batal_input_user() {
	$('#userTambahNIP').val('');
	$('#userTambahNama').val('');
	$('#userTambahUsername').val('');
	$('#userTambahPassword').val('');
	$('#userTambahEmail').val('');
	$('#userTambahTelepon').val('');
	$('#userTambahHP').val('');
	$('#form_input_user').hide();

}
function onSubmit(){
	if ($('#userTambahEmail').val()=='') {
		alert('Email harus diisi!');		
	}else
	if ($('#userTambahUsername').val()=='') {
		alert('Username harus diisi!');
	}else
	if ($('#userTambahPassword').val()=='') {
		alert('Password harus diisi!');
	}else{
		console.log('Data Valid!');
	}
}
