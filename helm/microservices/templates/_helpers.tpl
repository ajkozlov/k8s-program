{{/*
Common labels applied to every resource.
*/}}
{{- define "microservices.labels" -}}
helm.sh/chart: {{ printf "%s-%s" .Chart.Name .Chart.Version | quote }}
app.kubernetes.io/managed-by: {{ .Release.Service }}
app.kubernetes.io/instance: {{ .Release.Name }}
{{- end }}

{{/*
ConfigMap-specific labels.
*/}}
{{- define "microservices.configmap.labels" -}}
date: {{ now | date "2006-01-02" | quote }}
version: {{ .Chart.AppVersion | quote }}
{{- end }}
