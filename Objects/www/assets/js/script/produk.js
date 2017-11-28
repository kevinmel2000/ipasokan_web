$('#list_produk').DataTable();

function tambah_produk() {
	$('#form_input_produk').show();
}
function batal_input_produk() {
	$('#form_tambah_nama').val('');
	$('#form_tambah_status').val('');
	$('#form_tambah_keterangan').val('');
	$('#form_input_produk').hide();

}
function onSubmit(){
	var form={
		'nama':$('#form_tambah_nama').val(),
		'status':$('#form_tambah_status').val(),
		'keterangan':$('#form_tambah_keterangan').val()
	};
  var data = JSON.stringify(form);  
  console.log( data );
  return false; 
}
$('#status_select').on('change',function() {
   if($('#status_select option:selected').text()==='Lainnya') { 
   	$('#form_tambah_status').show();    	
   }
   else{   	
   	$('#form_tambah_status').val('');
   	$('#form_tambah_status').hide();
 		}
});