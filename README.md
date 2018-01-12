# Sploits
Place for random PoCs

### ojdbc_ssrf

Gadget (SSRF) in Oracle JDBC thin driver for Java native deserialization

[Details here](https://agrrrdog.blogspot.com/2018/01/java-deserialization-misusing-ojdbc-for.html) 

Requires [ojdbc7.jar](http://www.oracle.com/technetwork/database/features/jdbc/jdbc-drivers-12c-download-1958347.html).
FakeOracleConnection is a dump empty class that implements OracleConnection interface.
