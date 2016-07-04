(ns &lt;pbx-dom-api&gt;.api.default
  (:require [&lt;pbx-dom-api&gt;.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn calls-get-with-http-info
  "
  Gets `Calls` info."
  ([rpt-type rpt-id ] (calls-get-with-http-info rpt-type rpt-id nil))
  ([rpt-type rpt-id {:keys [start limit sort-by sort-type from-date to-date duration phone phone1 co ext pbx-id call-source call-type direction caller-name did dnis acc ring cost group ]}]
   (call-api "/Calls" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"rptType" rpt-type "rptId" rpt-id "start" start "limit" limit "sortBy" sort-by "sortType" sort-type "fromDate" from-date "toDate" to-date "duration" duration "phone" phone "phone1" phone1 "co" co "ext" ext "pbxId" pbx-id "callSource" call-source "callType" call-type "direction" direction "callerName" caller-name "did" did "dnis" dnis "acc" acc "ring" ring "cost" cost "group" group }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn calls-get
  "
  Gets `Calls` info."
  ([rpt-type rpt-id ] (calls-get rpt-type rpt-id nil))
  ([rpt-type rpt-id optional-params]
   (:data (calls-get-with-http-info rpt-type rpt-id optional-params))))

(defn features-charts-get-with-http-info
  "
  Gets `Charts` list."
  []
  (call-api "/Features/charts" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn features-charts-get
  "
  Gets `Charts` list."
  []
  (:data (features-charts-get-with-http-info)))

(defn features-reports-get-with-http-info
  "
  Gets `Reports` list."
  []
  (call-api "/Features/reports" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn features-reports-get
  "
  Gets `Reports` list."
  []
  (:data (features-reports-get-with-http-info)))

(defn features-widget-get-with-http-info
  "
  Gets `Widgets` list."
  []
  (call-api "/Features/widget" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn features-widget-get
  "
  Gets `Widgets` list."
  []
  (:data (features-widget-get-with-http-info)))

