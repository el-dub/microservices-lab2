#start minikube
minikube start
# Add addons for minikube
minikube addons enable ingress
minikube addons enable metrics-server
# Add docker environments
eval $(minikube docker-env)
# Go to ./service1 and build docker image
docker build -t service1:0.1 -f Dockerfile .
# Go to ./k8s
#create configmap for logstash from ./k8s/elk
kubectl create configmap log-manual-pipeline --from-file ./pipeline.conf
#Return and run elk-stack
kubectl apply -f elk
#Run postgres
kubectl apply -f postgres
#Run service1
kubectl apply -f service1
#Run ingress
kubectl apply -f ingress.yaml
# create namespace monitoring
kubectl create namespace monitoring
kubectl config set-context --current --namespace=monitoring
#install prometheus and grafana
helm install --namespace monitoring prometheus prometheus-community/kube-prometheus-stack
# go to ./k8s/prom-grafana and apply grafana-ingress
kubectl apply -f grafana_ingress.yaml
#open host to grafana
sudo nano /etc/hosts
#write in file
minikube_ip  grafana #your minikube ip
#get password to grafana
kubectl get secret --namespace monitoring prometheus-grafana -o jsonpath="{.data.admin-password}" | base64 --decode ; echo
#Grafana is accessible from "grafana" address in browser. login:admin and password from previous command
# service1 accessible from {minikube_ip}/first-entity
# kibana is accessible from {minikube_ip}/
