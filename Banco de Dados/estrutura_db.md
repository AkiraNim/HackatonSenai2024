<h1>usuarios</h1>
<ul>
	<li>id: INT PK</li>
	<li>nome: VARCHAR(255)</li>
	<li>nome_usuario: VARCHAR(255)</li>
	<li>senha: VARCHAR(255)</li>
	<li>data_criacao: DATETIME</li>
</ul>
<h1>telefones</h1>
<ul>
	<li>id: INT PK</li>
	<li>numero: VARCHAR(15)</li>
	<li>data_registro: DATETIME</li>
</ul>
<h1>ocorrencias_trote</h1>
<ul>
	<li>id: INT PK</li>
	<li>telefone_id: INT FK</li>
	<li>usuario_id: INT FK</li>
	<li>descricao: TEXT</li>
	<li>data_hora: DATETIME</li>
</ul>
