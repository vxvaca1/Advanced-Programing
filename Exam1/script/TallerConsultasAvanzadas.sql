/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     4/22/2019 1:26:48 PM                         */
/*==============================================================*/


drop table if exists PRODUCTS;

drop table if exists PROVIDERS;

/*==============================================================*/
/* Table: PRODUCTS                                              */
/*==============================================================*/
create table PRODUCTS
(
   ID                   varchar(16) not null,
   IDPROVIDERS          varchar(16),
   NAME                 varchar(32),
   DESCRIPTION          varchar(16),
   QUANTITY             int,
   PRICE                float(32),
   primary key (ID)
);

/*==============================================================*/
/* Table: PROVIDERS                                             */
/*==============================================================*/
create table PROVIDERS
(
   IDPROVIDERS          varchar(16) not null,
   NAME                 varchar(32),
   ADDRESS              varchar(32),
   TELEPHONE            numeric(16,0),
   primary key (IDPROVIDERS)
);

alter table PRODUCTS add constraint FK_ENTREGA foreign key (IDPROVIDERS)
      references PROVIDERS (IDPROVIDERS) on delete restrict on update restrict;

