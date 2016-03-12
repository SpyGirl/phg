-- Table: public.amount

-- DROP TABLE public.amount;

CREATE TABLE public.amount
(
  "PharmacyID" integer NOT NULL DEFAULT 0,
  "PackageID" integer NOT NULL DEFAULT 0,
  "ReportDate" integer NOT NULL DEFAULT 0,
  "Remainder" numeric NOT NULL DEFAULT 0.00,
  "Price3" integer NOT NULL DEFAULT 0,
  "SalesId" serial NOT NULL,
  filename character(50),
  CONSTRAINT amount_pkey PRIMARY KEY ("SalesId")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.amount
  OWNER TO postgres;

-- Index: public."amount_PackageID"

-- DROP INDEX public."amount_PackageID";

CREATE INDEX "amount_PackageID"
  ON public.amount
  USING btree
  ("PackageID");

-- Index: public."amount_PharmacyID"

-- DROP INDEX public."amount_PharmacyID";

CREATE INDEX "amount_PharmacyID"
  ON public.amount
  USING btree
  ("PharmacyID");

-- Index: public."amount_ReportDate"

-- DROP INDEX public."amount_ReportDate";

CREATE INDEX "amount_ReportDate"
  ON public.amount
  USING btree
  ("ReportDate");




-- Table: public.packages

-- DROP TABLE public.packages;

CREATE TABLE public.packages
(
  id serial NOT NULL,
  packageid integer,
  brend character varying(255),
  drug character varying(255),
  form character varying(255),
  CONSTRAINT packages_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.packages
  OWNER TO postgres;

-- Index: public.packages_brend

-- DROP INDEX public.packages_brend;

CREATE INDEX packages_brend
  ON public.packages
  USING btree
  (brend COLLATE pg_catalog."default");

-- Index: public.packages_drug

-- DROP INDEX public.packages_drug;

CREATE INDEX packages_drug
  ON public.packages
  USING btree
  (drug COLLATE pg_catalog."default");

-- Index: public.packages_form

-- DROP INDEX public.packages_form;

CREATE INDEX packages_form
  ON public.packages
  USING btree
  (form COLLATE pg_catalog."default");

-- Index: public.packages_packageid

-- DROP INDEX public.packages_packageid;

CREATE INDEX packages_packageid
  ON public.packages
  USING btree
  (packageid);


-- Table: public.pharmacies

-- DROP TABLE public.pharmacies;

CREATE TABLE public.pharmacies
(
  id serial NOT NULL, -- Код Аптеки
  pharmacy character varying(80) NOT NULL, -- Название Аптеки
  pharmacyid integer,
  region text,
  town character varying(255),
  adress text,
  phunionid integer,
  prefix character(50),
  CONSTRAINT pharmacies_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.pharmacies
  OWNER TO postgres;
COMMENT ON COLUMN public.pharmacies.id IS 'Код Аптеки';
COMMENT ON COLUMN public.pharmacies.pharmacy IS 'Название Аптеки';

