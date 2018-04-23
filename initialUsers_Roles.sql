INSERT INTO users (user_name, user_pass) VALUES ('admin', 'test')
INSERT INTO users (user_name, user_pass) VALUES ('user', 'test')
INSERT INTO users (user_name, user_pass) VALUES ('user_admin', 'test')

INSERT INTO roles (role_name) VALUES ('Admin')
INSERT INTO roles (role_name) VALUES ('User')


INSERT INTO user_roles (role_name, user_name) VALUES ('Admin', 'admin')
INSERT INTO user_roles (role_name, user_name) VALUES ('User', 'user')
INSERT INTO user_roles (role_name, user_name) VALUES ('User', 'user_admin')
INSERT INTO user_roles (role_name, user_name) VALUES ('Admin', 'user_admin')
