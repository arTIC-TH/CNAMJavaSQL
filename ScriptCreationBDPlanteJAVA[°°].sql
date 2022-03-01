drop database if exists BdPlante;

create database if not exists BdPlante;
use BdPlante;

create TABLE clients(
id_client int(11) primary key AUTO_INCREMENT,
nom_cli varchar(100),
prenom_cli varchar(100),
adr_cli  varchar(300),
cp_cli int(5),
ville_cli varchar(100),
data_crea_cli date,
isdeleted_cli  tinyint(1),
email_cli varchar(45),
mpasse_cli varchar(45),
tel_cli varchar(20)
);


create  TABLE commande(
id_comm int(11) auto_increment,
id_client int(11),
date_comm date,
montant_comm decimal(11,2),
isdeleted_comm tinyint(1),
date_validation date,
Constraint pk_commande primary key(id_comm),
constraint fk_commande_client foreign key (id_client) references clients (id_client)
);

create TABLE produits(
id_produit int(11) auto_increment,
libelle_court_prod varchar(300),
libelle_long_prod varchar(300),
chemin_photo_prod varchar(300),
isdeleted_prod  tinyint(1),
date_creat_prod  date,
quantite_prod int(10),
date_derniere_commande date,
message_prod text,
constraint pk_produits primary key(id_produit)
);

create TABLE prix (
	id_prix int(11) auto_increment,
	date_debutVal_prix date,
	date_finVal_prix date,
	isdeleted tinyint(1),
	id_produit int(11),
	prix_prix decimal(10,2),
	constraint pk_prix primary key (id_prix),
	constraint fk_prix foreign key (id_produit) references Produits(id_produit)
);

create TABLE detail_commande(
id_detail_DC int(11) auto_increment,
id_comm  int(11),
id_produit int (11),
Qte_crea_DC int (11),
date_crea_DC date,
is_deleted_DC  int(11),
constraint pk_detail_commande primary key(id_detail_DC),
constraint fk_detail_commande foreign key(id_comm) references commande(id_comm),
constraint fk_detail_produit foreign key(id_produit) references produits(id_produit)
);

create TABLE paiement(
	id_paie int(11) auto_increment,
	date_paie date,
	date_traitement_paie date,
	date_validation_paie date,
	id_comm int(11),
	constraint pk_paiement primary key (id_paie) ,
	constraint fk_paiement_commande foreign key (id_comm) references commande (id_comm)
);

create table users_admin (
id_user int(6),
nom_user varchar(50),
prenom_user varchar(50),
pseudo_user varchar(50),
mp_user varchar(50),
conn_date_user date
);