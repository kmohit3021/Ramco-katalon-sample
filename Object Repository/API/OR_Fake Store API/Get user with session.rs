<?xml version="1.0" encoding="UTF-8"?><WebServiceRequestEntity>
    
  <description/>
    
  <name>Get user with session</name>
    
  <tag/>
    
  <elementGuidId>f4868986-2034-4912-85ab-0bb240367064</elementGuidId>
    
  <selectorMethod>BASIC</selectorMethod>
    
  <smartLocatorEnabled>false</smartLocatorEnabled>
    
  <useRalativeImagePath>false</useRalativeImagePath>
    
  <authorizationRequest>
        
    <authorizationInfo>
            
      <entry>
                
        <key>bearerToken</key>
                
        <value>${access_token}</value>
              
      </entry>
          
    </authorizationInfo>
        
    <authorizationType>Bearer</authorizationType>
      
  </authorizationRequest>
    
  <autoUpdateContent>true</autoUpdateContent>
    
  <connectionTimeout>0</connectionTimeout>
    
  <followRedirects>false</followRedirects>
    
  <httpBody/>
    
  <httpBodyContent/>
    
  <httpBodyType/>
    
  <httpHeaderProperties>
        
    <isSelected>true</isSelected>
        
    <matchCondition>equals</matchCondition>
        
    <name>Accept</name>
        
    <type>Main</type>
        
    <value>application/json</value>
        
    <webElementGuid>0a5b06a1-95aa-46cd-9a6d-b661b691806d</webElementGuid>
      
  </httpHeaderProperties>
    
  <httpHeaderProperties>
        
    <isSelected>true</isSelected>
        
    <matchCondition>equals</matchCondition>
        
    <name>Content-Type</name>
        
    <type>Main</type>
        
    <value>application/json</value>
        
    <webElementGuid>ff533b4d-7463-4585-aa66-545b6083986a</webElementGuid>
      
  </httpHeaderProperties>
    
  <httpHeaderProperties>
        
    <isSelected>true</isSelected>
        
    <matchCondition>equals</matchCondition>
        
    <name>Authorization</name>
        
    <type>Main</type>
        
    <value>Bearer ${access_token}</value>
        
    <webElementGuid>762de36d-583c-478f-aa15-c894b96de1c5</webElementGuid>
      
  </httpHeaderProperties>
    
  <katalonVersion>9.6.0</katalonVersion>
    
  <maxResponseSize>0</maxResponseSize>
    
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
    
  <socketTimeout>0</socketTimeout>
    
  <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
    
  <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementPropertyValue(response, 'email', "john@mail.com")
WS.verifyElementPropertyValue(response, 'password', "changeme")
WS.verifyElementPropertyValue(response, 'name', "Jhon")
WS.verifyElementPropertyValue(response, 'role', "customer")</verificationScript>
    
  <wsdlAddress/>
  
</WebServiceRequestEntity>
