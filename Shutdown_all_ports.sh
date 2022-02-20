#Ports:
config_server_port = 8888
eureka_server_port = 9102
client_test_port = 1436
client_dev_port = 2346

#kill-port command using npx (NPM required)
npx kill-port $client_test_port
npx kill-port $client_dev_port
npx kill-port $config_server_port
npx kill-port $eureka_server_port