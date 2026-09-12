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
