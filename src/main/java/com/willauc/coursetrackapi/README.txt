CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'APPUSER';
GRANT ALL PRIVILEGES ON store.* TO 'appuser'@'localhost';
FLUSH PRIVILEGES;
