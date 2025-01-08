CREATE TABLE sst.roles
(
    id   BIGINT NOT NULL,
    name VARCHAR(20),
    CONSTRAINT pk_roles PRIMARY KEY (id)
);

CREATE TABLE sst.user_roles
(
    role_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    CONSTRAINT pk_user_roles PRIMARY KEY (role_id, user_id)
);

CREATE TABLE sst.users
(
    id         BIGINT NOT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    login      VARCHAR(20),
    email      VARCHAR(50),
    password   VARCHAR(120),
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE sst.users
    ADD CONSTRAINT uc_users_email UNIQUE (email);

ALTER TABLE sst.users
    ADD CONSTRAINT uc_users_login UNIQUE (login);

ALTER TABLE sst.user_roles
    ADD CONSTRAINT fk_userol_on_role FOREIGN KEY (role_id) REFERENCES sst.roles (id);

ALTER TABLE sst.user_roles
    ADD CONSTRAINT fk_userol_on_user FOREIGN KEY (user_id) REFERENCES sst.users (id);