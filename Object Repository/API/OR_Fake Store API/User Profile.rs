<?xml version="1.0" encoding="UTF-8"?><WebServiceRequestEntity>
    
  <description/>
    
  <name>User Profile</name>
    
  <tag/>
    
  <elementGuidId>6367da8b-c497-45f9-9dbf-593dced76c3d</elementGuidId>
    
  <selectorMethod>XPATH</selectorMethod>
    
  <smartLocatorEnabled>true</smartLocatorEnabled>
    
  <useRalativeImagePath>false</useRalativeImagePath>
    
  <autoUpdateContent>true</autoUpdateContent>
    
  <connectionTimeout>-1</connectionTimeout>
    
  <followRedirects>true</followRedirects>
    
  <httpBody/>
    
  <httpBodyContent/>
    
  <httpBodyType/>
    
  <httpHeaderProperties>
        
    <isSelected>true</isSelected>
        
    <matchCondition>equals</matchCondition>
        
    <name>Authorization</name>
        
    <type>Main</type>
        
    <value>Bearer ${access_token}</value>
        
    <webElementGuid>a8a7c888-0dff-4d06-b413-b67cd3e403b1</webElementGuid>
      
  </httpHeaderProperties>
    
  <katalonVersion>10.3.0</katalonVersion>
    
  <maxResponseSize>-1</maxResponseSize>
    
  <migratedVersion>5.4.1</migratedVersion>
    
  <path/>
    
  <restRequestMethod>GET</restRequestMethod>
    
  <restUrl>https://api.escuelajs.co/api/v1/auth/profile</restUrl>
    
  <serviceType>RESTful</serviceType>
    
  <soapBody/>
    
  <soapHeader/>
    
  <soapRequestMethod/>
    
  <soapServiceEndpoint/>
    
  <soapServiceFunction/>
    
  <socketTimeout>-1</socketTimeout>
    
  <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
    
  <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
    
  <wsdlAddress/>
  
</WebServiceRequestEntity>
