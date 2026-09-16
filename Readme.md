K8s Command:



kubectl apply -f pod.yml start creating pod

kubectl apply -f service.yml  start creating service

kubectl get pod  check status of pod

kubectl get service  check status of service

kubectl get replicaset

checking pod iP

kubectl get pods -o wide

kubectl edit pod k8s-deployment-85598d74b6-lfsvp -change image version


View Logs for a Specific Pod

kubectl get pods

kubectl logs <pod-name>

Stream Logs in Real-Time (Follow Mode)

kubectl logs -f <pod-name>

View Logs Using Labels (Shortcut)

kubectl logs -l app=spring-boot-app

Check Previous Container Logs (If crashed)

kubectl logs <pod-name> -p

kubectl delete deploy k8s-deployment

kubectl delete pod <pod-name>

kubectl delete service <service-name>


after namespacing

get deployments -n springboot-ns

get pod -n springboot-ns

kubectl get svc -n service-ns

type client-node-port.yaml show code

kubectl get namespace

kubectl get namespace kube-system

kubectl apply -f .\SpringBootConfigMap.yaml

kubectl get cm

kubectl apply -f .\SpringBootSecrets.yaml

kubectl get secret



Pod Networking :: Container Network Interface

192.168.0.0/32 2^0  0  192.168.0.0

192.168.0.0/31 2^1  2  192.168.0.0 > 192.168.0.1

192.168.0.0/30 2^2  4          0.0 >           (0,1,2,3)

192.168.0.0/29 2^3  8          0.0 >           (0,1,2,3,5,6,7)

Route Networking

Pod to Pod communication

minikube

winget install Kubernetes.minikube

kubectl get pods

kubectl get pods -o wide   : ip chacking

port forwarding;pod to pod communication

kubectl port-forward pod/pod-b 8081:8080


https://kubernetes.io/docs/tasks/access-application-cluster/
