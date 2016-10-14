The project shows a small implementation of the <strong>Spring Microservices</strong>
on top of Netflix-Eureka. The Project has 3 main components 
<ul>
  <li>Service Registry</li>
  <li>Service</li>
  <li>Consumer</li>
</ul>
All the components are developed on Spring Boot.
<p>
  <strong>Service Registry</strong><br/>
  Netflix-Eureka service components get registered automatically. The Client Services pull Service urls from the registry to execute requests.<br/>
  This component has to be run first. It runs a web application on the http://localhost:1111
</p>
<p>
  <strong>Service</strong><br/>
  The Service component exposes a 'sayHello' RESTFull service.
  Start the application and refresh the Registry component. It should display the registered service
  <strong>APES-SERVICE</strong>.<br/>
  Run a test at http://localhost:3331/sayhello/Ape<br/>
  The Browser should respond - > Well, Hello Ape !!
</p>
<p>
  <strong>Consumer</strong><br/>
  The Consumer component delegates the HTTP requests to the Service component and sends the response to the Browser.
  Start the application and refresh the Registry component. It should display the registered service
  <strong>CONSUMER</strong>.<br/>
  Run a test at http://localhost:3332/consumer/Ape<br/>
  The Browser should respond - > Well, Hello Ape !!
</p>
