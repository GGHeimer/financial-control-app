create table if not exists `users` (
	userId int not null auto_increment,
    userName varchar(100) not null,
    primary key(`userId`)
) ENGINE = InnoDB;

create table if not exists `incomings` (
	incId int not null auto_increment,
	incName VARCHAR(100) NOT NULL,
	incAmou DECIMAL(10,2) not null,
	incTith boolean not NULL,
	incDate DATE NOT NULL,
	incCat VARCHAR(50) NOT NULL,
    userId int not null,
    primary key(`incId`),
	constraint fk_incomings_incId
		foreign key (userId)
		references `users` (`userId`)
        on delete cascade
        on update cascade
    )
ENGINE = InnoDB;

create table if not exists `outgoings` (
	outId int not null auto_increment,
	outName VARCHAR(100) NOT NULL,
	outAmou DECIMAL(10,2) not null,
    outDueDate date,
	outStatus boolean not NULL,
	outDate DATE NOT NULL,
	outCat VARCHAR(50) NOT NULL,
    userId int not null,
    primary key(`outId`),
	constraint fk_outgoings_incId
		foreign key (userId)
		references `users` (`userId`)
        on delete cascade
        on update cascade
    )
ENGINE = InnoDB;