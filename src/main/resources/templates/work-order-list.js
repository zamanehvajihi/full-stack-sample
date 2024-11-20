
$(document).ready(function() {

	$('#workOrderTable').DataTable({

		ajax: {
			url: '/getWorkOrders',
			dataSrc: '',
		},
		columns: [
			{
				data: 'woName'
			},
			{
				data: 'teamName'
			},
			{
				data: 'location'
			},
			{
				data: 'creationDate'
			},
			{
				data: 'description'
			},
		],
		pageLength: 10,
		lengthMenu: [5, 10, 15, 20],
		searching: true,
		ordering: true,
		paging: true,

		language: {
			search: "Search:",
			lengthMenu: "Show _MENU_ entries",
			info: "Showing _START_ to _END_ of _TOTAL_ entries",
		},

	});

});
