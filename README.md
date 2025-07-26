<h2>📘 gRPC Hello Service – .proto File Explanation</h2>
 
<pre><code>syntax = "proto3";
 
option java_multiple_files = true;
option java_package = "com.example.hello";
option java_outer_classname = "HelloProto";
 
message HelloRequest {
  string name = 1;
}
 
message HelloResponse {
  string message = 1;
}
 
service HelloService {
  rpc SayHello (HelloRequest) returns (HelloResponse);
}
</code></pre>
 
<h3>📝 Explanation Line-by-Line</h3>
 
<ul>
  <li><strong>syntax = "proto3";</strong><br />
    Tells the Protocol Buffer compiler to use version 3 of the syntax (modern and simpler).</li>
 
  <li><strong>option java_multiple_files = true;</strong><br />
    Generates separate Java files for each message and service, instead of one big file.<br />
    ✅ Helps organize code better in real projects.</li>
 
  <li><strong>option java_package = "com.example.hello";</strong><br />
    Specifies the Java package name for the generated Java files.</li>
 
  <li><strong>option java_outer_classname = "HelloProto";</strong><br />
    Sets the outer class name if multiple files are not used (optional when <code>java_multiple_files = true</code>).</li>
 
  <li><strong>message HelloRequest</strong><br />
    Defines the request message with one field:
    <ul>
      <li><code>string name = 1;</code> – A string field named <code>name</code>, with field number <code>1</code>.</li>
    </ul>
  </li>
 
  <li><strong>message HelloResponse</strong><br />
    Defines the response message with one field:
    <ul>
      <li><code>string message = 1;</code> – The greeting message returned to the client.</li>
    </ul>
  </li>
 
  <li><strong>service HelloService</strong><br />
    Defines the gRPC service with a single RPC method:
    <ul>
      <li><code>rpc SayHello (HelloRequest) returns (HelloResponse);</code></li>
      <li>The client sends a <code>HelloRequest</code>, and the server responds with a <code>HelloResponse</code>.</li>
    </ul>
  </li>
</ul>
 
<h3>📦 Summary Table</h3>
 
<table>
  <thead>
    <tr>
      <th>Line</th>
      <th>Purpose</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>syntax = "proto3"</code></td>
      <td>Use Protocol Buffers version 3</td>
    </tr>
    <tr>
      <td><code>java_multiple_files</code></td>
      <td>Create multiple .java files for better organization</td>
    </tr>
    <tr>
      <td><code>java_package</code></td>
      <td>Defines the generated Java package</td>
    </tr>
    <tr>
      <td><code>java_outer_classname</code></td>
      <td>Wrapper class if not using multiple files</td>
    </tr>
    <tr>
      <td><code>message HelloRequest</code></td>
      <td>Defines request object (input)</td>
    </tr>
    <tr>
      <td><code>message HelloResponse</code></td>
      <td>Defines response object (output)</td>
    </tr>
    <tr>
      <td><code>service HelloService</code></td>
      <td>Defines the gRPC service and method</td>
    </tr>
  </tbody>
</table>
 
<h3>💡 Tip: Field Numbers</h3>
<p>
  The numbers like <code>= 1;</code> are field identifiers. They're critical for binary encoding and backward compatibility.<br />
  ✅ Never change them once deployed.<br />
  ❌ Don't reuse or reorder field numbers.
</p>
