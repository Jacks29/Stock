drop database Stock;
create database Stock;

create table `stock`.`Fornecedor`(
`codigoFornecedor` int primary key auto_increment not null,
`razaoSocial` varchar(50) not null,
`endereço` varchar(50) ,
`telefone` varchar(18) not null,
`email` varchar(50) not null
);


create table `stock`.`Unidade`(
`codigoUnidade` int primary key auto_increment not null,
`franquia` varchar(50) not null
);

INSERT INTO `stock`.`Unidade` (`franquia`) VALUES ('Matriz');

CREATE TABLE `stock`.`Produto` (
`codigoProduto` int primary key not null,
`nomeProduto` varchar(45) not null,
`dataValidade` date,
`dataProcessamento` date,
`precoCompra` double(5,2) not null,
`precoVenda` double(5,2) not null,
`quantidade` int not null,
`armazenamento` varchar(15) not null,
`codigoFornecedor` int,
`loteProduto` int,
`codigoUnidade` int not null,
CONSTRAINT fk_ProUni FOREIGN KEY (codigoUnidade) REFERENCES Unidade (codigoUnidade),
CONSTRAINT fk_ProFor FOREIGN KEY (codigoFornecedor) REFERENCES Fornecedor (codigoFornecedor)
);

create table `stock`.`Usuario`(
`codigoUsuario` int primary key not null auto_increment,
`login` varchar(30) not null,
`nome` varchar(50) not null,
`senha` varchar(50) not null,
`cargo` varchar(50) not null,
`codigoUnidade` int not null,
CONSTRAINT fk_UsuUni FOREIGN KEY (codigoUnidade) REFERENCES Unidade (codigoUnidade)
);

INSERT INTO `STOCK`.`usuario` (`login`, `nome`, `senha`,`cargo`, `codigoUnidade`) VALUES ('Admin', 'Admin', 'Admin', 'Admin', '1');

create table `stock`.`ProdutosVendidos`(
`codigoVenda` INT NOT NULL AUTO_INCREMENT,
`codigoProduto` int not null,
`quantidade` int not null,
`valorUnitario` double(5,2) not null,
`codigoUnidade` int not null,
`codigoUsuario` int not null,
CONSTRAINT fk_ProVenPro FOREIGN KEY (codigoProduto) REFERENCES Produto (codigoProduto),
CONSTRAINT fk_ProVenUni FOREIGN KEY (codigoUnidade) REFERENCES Unidade (codigoUnidade),
CONSTRAINT fk_ProVenUsi FOREIGN KEY (codigoUsuario) REFERENCES Usuario (codigoUsuario),
primary key(`codigoVenda`)
);

create table `stock`.`Alteracao_PrecoPorData`(
`codigoAlteracao` INT NOT NULL AUTO_INCREMENT,
`codigoProduto` int not null,
`porcentagem` varchar(5),
`dataAlteracaoInicio` date,
`dataAlteracaoFim` date,
`codigoUsuario` int not null,
`codigoUnidade` int not null,
CONSTRAINT fk_ProdAlt FOREIGN KEY (codigoProduto) REFERENCES Produto (codigoProduto),
CONSTRAINT fk_AlteraUni FOREIGN KEY (codigoUnidade) REFERENCES Unidade (codigoUnidade),
CONSTRAINT fk_UsuarioAlt FOREIGN KEY (codigoUsuario) REFERENCES Usuario (codigoUsuario),
primary key(`codigoAlteracao`)
);
