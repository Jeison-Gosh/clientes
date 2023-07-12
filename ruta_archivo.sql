--
-- PostgreSQL database dump
--

-- Dumped from database version 14.4
-- Dumped by pg_dump version 14.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    id integer NOT NULL,
    nombre character varying(50) NOT NULL,
    telefono numeric,
    direccion character varying(80),
    correo character varying(80),
    tipo_cliente smallint NOT NULL,
    cedula numeric NOT NULL
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- Name: clientes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.clientes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clientes_id_seq OWNER TO postgres;

--
-- Name: clientes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.clientes_id_seq OWNED BY public.clientes.id;


--
-- Name: tipo_cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tipo_cliente (
    id smallint NOT NULL,
    descripcion text NOT NULL
);


ALTER TABLE public.tipo_cliente OWNER TO postgres;

--
-- Name: tipo_cliente_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tipo_cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tipo_cliente_id_seq OWNER TO postgres;

--
-- Name: tipo_cliente_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tipo_cliente_id_seq OWNED BY public.tipo_cliente.id;


--
-- Name: clientes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes ALTER COLUMN id SET DEFAULT nextval('public.clientes_id_seq'::regclass);


--
-- Name: tipo_cliente id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_cliente ALTER COLUMN id SET DEFAULT nextval('public.tipo_cliente_id_seq'::regclass);


--
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.clientes (id, nombre, telefono, direccion, correo, tipo_cliente, cedula) FROM stdin;
36	ClienteTEas	2223332		gmaril@gmail.aa	1	2233332
46	ClienteTEas	2223332	Kr 15 # 24 -54	GMAIL@outlok.com	1	12345665322
49	ClienteTEas	2223332	Kr 15 # 24 -54	GMAIL@outlok.com	1	1234523331
\.


--
-- Data for Name: tipo_cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tipo_cliente (id, descripcion) FROM stdin;
1	Persona natural
2	Persona juridica
\.


--
-- Name: clientes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.clientes_id_seq', 49, true);


--
-- Name: tipo_cliente_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tipo_cliente_id_seq', 2, true);


--
-- Name: clientes clientes_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pk PRIMARY KEY (id);


--
-- Name: clientes clientes_un; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_un UNIQUE (cedula);


--
-- Name: tipo_cliente tipo_cliente_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_cliente
    ADD CONSTRAINT tipo_cliente_pk PRIMARY KEY (id);


--
-- Name: clientes clientes_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_fk FOREIGN KEY (tipo_cliente) REFERENCES public.tipo_cliente(id) ON UPDATE CASCADE;


--
-- PostgreSQL database dump complete
--

