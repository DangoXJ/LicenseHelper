LicenseHelper
=============

QCC
```diff
Nmap 6.47 ( http://nmap.org )				      |	Nmap 7.01 ( https://nmap.org )
Usage: nmap [Scan Type(s)] [Options] {target specification}	Usage: nmap [Scan Type(s)] [Options] {target specification}
TARGET SPECIFICATION:						TARGET SPECIFICATION:
  Can pass hostnames, IP addresses, networks, etc.		  Can pass hostnames, IP addresses, networks, etc.
  Ex: scanme.nmap.org, microsoft.com/24, 192.168.0.1; 10.0.0-	  Ex: scanme.nmap.org, microsoft.com/24, 192.168.0.1; 10.0.0-
  -iL <inputfilename>: Input from list of hosts/networks	  -iL <inputfilename>: Input from list of hosts/networks
  -iR <num hosts>: Choose random targets			  -iR <num hosts>: Choose random targets
  --exclude <host1[,host2][,host3],...>: Exclude hosts/networ	  --exclude <host1[,host2][,host3],...>: Exclude hosts/networ
  --excludefile <exclude_file>: Exclude list from file		  --excludefile <exclude_file>: Exclude list from file
HOST DISCOVERY:							HOST DISCOVERY:
  -sL: List Scan - simply list targets to scan			  -sL: List Scan - simply list targets to scan
  -sn: Ping Scan - disable port scan				  -sn: Ping Scan - disable port scan
  -Pn: Treat all hosts as online -- skip host discovery		  -Pn: Treat all hosts as online -- skip host discovery
  -PS/PA/PU/PY[portlist]: TCP SYN/ACK, UDP or SCTP discovery 	  -PS/PA/PU/PY[portlist]: TCP SYN/ACK, UDP or SCTP discovery 
  -PE/PP/PM: ICMP echo, timestamp, and netmask request discov	  -PE/PP/PM: ICMP echo, timestamp, and netmask request discov
  -PO[protocol list]: IP Protocol Ping				  -PO[protocol list]: IP Protocol Ping
  -n/-R: Never do DNS resolution/Always resolve [default: som	  -n/-R: Never do DNS resolution/Always resolve [default: som
  --dns-servers <serv1[,serv2],...>: Specify custom DNS serve	  --dns-servers <serv1[,serv2],...>: Specify custom DNS serve
  --system-dns: Use OS's DNS resolver				  --system-dns: Use OS's DNS resolver
  --traceroute: Trace hop path to each host			  --traceroute: Trace hop path to each host
SCAN TECHNIQUES:						SCAN TECHNIQUES:
  -sS/sT/sA/sW/sM: TCP SYN/Connect()/ACK/Window/Maimon scans	  -sS/sT/sA/sW/sM: TCP SYN/Connect()/ACK/Window/Maimon scans
  -sU: UDP Scan							  -sU: UDP Scan
  -sN/sF/sX: TCP Null, FIN, and Xmas scans			  -sN/sF/sX: TCP Null, FIN, and Xmas scans
  --scanflags <flags>: Customize TCP scan flags			  --scanflags <flags>: Customize TCP scan flags
  -sI <zombie host[:probeport]>: Idle scan			  -sI <zombie host[:probeport]>: Idle scan
  -sY/sZ: SCTP INIT/COOKIE-ECHO scans				  -sY/sZ: SCTP INIT/COOKIE-ECHO scans
  -sO: IP protocol scan						  -sO: IP protocol scan
  -b <FTP relay host>: FTP bounce scan				  -b <FTP relay host>: FTP bounce scan
PORT SPECIFICATION AND SCAN ORDER:				PORT SPECIFICATION AND SCAN ORDER:
  -p <port ranges>: Only scan specified ports			  -p <port ranges>: Only scan specified ports
    Ex: -p22; -p1-65535; -p U:53,111,137,T:21-25,80,139,8080,	    Ex: -p22; -p1-65535; -p U:53,111,137,T:21-25,80,139,8080,
							      >	  --exclude-ports <port ranges>: Exclude the specified ports 
  -F: Fast mode - Scan fewer ports than the default scan	  -F: Fast mode - Scan fewer ports than the default scan
  -r: Scan ports consecutively - don't randomize		  -r: Scan ports consecutively - don't randomize
  --top-ports <number>: Scan <number> most common ports		  --top-ports <number>: Scan <number> most common ports
  --port-ratio <ratio>: Scan ports more common than <ratio>	  --port-ratio <ratio>: Scan ports more common than <ratio>
SERVICE/VERSION DETECTION:					SERVICE/VERSION DETECTION:
  -sV: Probe open ports to determine service/version info	  -sV: Probe open ports to determine service/version info
  --version-intensity <level>: Set from 0 (light) to 9 (try a	  --version-intensity <level>: Set from 0 (light) to 9 (try a
  --version-light: Limit to most likely probes (intensity 2)	  --version-light: Limit to most likely probes (intensity 2)
  --version-all: Try every single probe (intensity 9)		  --version-all: Try every single probe (intensity 9)
  --version-trace: Show detailed version scan activity (for d	  --version-trace: Show detailed version scan activity (for d
SCRIPT SCAN:							SCRIPT SCAN:
  -sC: equivalent to --script=default				  -sC: equivalent to --script=default
  --script=<Lua scripts>: <Lua scripts> is a comma separated 	  --script=<Lua scripts>: <Lua scripts> is a comma separated 
           directories, script-files or script-categories	           directories, script-files or script-categories
  --script-args=<n1=v1,[n2=v2,...]>: provide arguments to scr	  --script-args=<n1=v1,[n2=v2,...]>: provide arguments to scr
  --script-args-file=filename: provide NSE script args in a f	  --script-args-file=filename: provide NSE script args in a f
  --script-trace: Show all data sent and received		  --script-trace: Show all data sent and received
  --script-updatedb: Update the script database.		  --script-updatedb: Update the script database.
  --script-help=<Lua scripts>: Show help about scripts.		  --script-help=<Lua scripts>: Show help about scripts.
           <Lua scripts> is a comma-separated list of script-	           <Lua scripts> is a comma-separated list of script-
           script-categories.					           script-categories.
OS DETECTION:							OS DETECTION:
  -O: Enable OS detection					  -O: Enable OS detection
  --osscan-limit: Limit OS detection to promising targets	  --osscan-limit: Limit OS detection to promising targets
  --osscan-guess: Guess OS more aggressively			  --osscan-guess: Guess OS more aggressively
TIMING AND PERFORMANCE:						TIMING AND PERFORMANCE:
  Options which take <time> are in seconds, or append 'ms' (m	  Options which take <time> are in seconds, or append 'ms' (m
  's' (seconds), 'm' (minutes), or 'h' (hours) to the value (	  's' (seconds), 'm' (minutes), or 'h' (hours) to the value (
  -T<0-5>: Set timing template (higher is faster)		  -T<0-5>: Set timing template (higher is faster)
  --min-hostgroup/max-hostgroup <size>: Parallel host scan gr	  --min-hostgroup/max-hostgroup <size>: Parallel host scan gr
  --min-parallelism/max-parallelism <numprobes>: Probe parall	  --min-parallelism/max-parallelism <numprobes>: Probe parall
  --min-rtt-timeout/max-rtt-timeout/initial-rtt-timeout <time	  --min-rtt-timeout/max-rtt-timeout/initial-rtt-timeout <time
      probe round trip time.					      probe round trip time.
  --max-retries <tries>: Caps number of port scan probe retra	  --max-retries <tries>: Caps number of port scan probe retra
  --host-timeout <time>: Give up on target after this long	  --host-timeout <time>: Give up on target after this long
  --scan-delay/--max-scan-delay <time>: Adjust delay between 	  --scan-delay/--max-scan-delay <time>: Adjust delay between 
  --min-rate <number>: Send packets no slower than <number> p	  --min-rate <number>: Send packets no slower than <number> p
  --max-rate <number>: Send packets no faster than <number> p	  --max-rate <number>: Send packets no faster than <number> p
FIREWALL/IDS EVASION AND SPOOFING:				FIREWALL/IDS EVASION AND SPOOFING:
  -f; --mtu <val>: fragment packets (optionally w/given MTU)	  -f; --mtu <val>: fragment packets (optionally w/given MTU)
  -D <decoy1,decoy2[,ME],...>: Cloak a scan with decoys		  -D <decoy1,decoy2[,ME],...>: Cloak a scan with decoys
  -S <IP_Address>: Spoof source address				  -S <IP_Address>: Spoof source address
  -e <iface>: Use specified interface				  -e <iface>: Use specified interface
  -g/--source-port <portnum>: Use given port number		  -g/--source-port <portnum>: Use given port number
  --proxies <url1,[url2],...>: Relay connections through HTTP	  --proxies <url1,[url2],...>: Relay connections through HTTP
							      >	  --data <hex string>: Append a custom payload to sent packet
							      >	  --data-string <string>: Append a custom ASCII string to sen
  --data-length <num>: Append random data to sent packets	  --data-length <num>: Append random data to sent packets
  --ip-options <options>: Send packets with specified ip opti	  --ip-options <options>: Send packets with specified ip opti
  --ttl <val>: Set IP time-to-live field			  --ttl <val>: Set IP time-to-live field
  --spoof-mac <mac address/prefix/vendor name>: Spoof your MA	  --spoof-mac <mac address/prefix/vendor name>: Spoof your MA
  --badsum: Send packets with a bogus TCP/UDP/SCTP checksum	  --badsum: Send packets with a bogus TCP/UDP/SCTP checksum
OUTPUT:								OUTPUT:
  -oN/-oX/-oS/-oG <file>: Output scan in normal, XML, s|<rIpt	  -oN/-oX/-oS/-oG <file>: Output scan in normal, XML, s|<rIpt
     and Grepable format, respectively, to the given filename	     and Grepable format, respectively, to the given filename
  -oA <basename>: Output in the three major formats at once	  -oA <basename>: Output in the three major formats at once
  -v: Increase verbosity level (use -vv or more for greater e	  -v: Increase verbosity level (use -vv or more for greater e
  -d: Increase debugging level (use -dd or more for greater e	  -d: Increase debugging level (use -dd or more for greater e
  --reason: Display the reason a port is in a particular stat	  --reason: Display the reason a port is in a particular stat
  --open: Only show open (or possibly open) ports		  --open: Only show open (or possibly open) ports
  --packet-trace: Show all packets sent and received		  --packet-trace: Show all packets sent and received
  --iflist: Print host interfaces and routes (for debugging)	  --iflist: Print host interfaces and routes (for debugging)
  --log-errors: Log errors/warnings to the normal-format outp <
  --append-output: Append to rather than clobber specified ou	  --append-output: Append to rather than clobber specified ou
  --resume <filename>: Resume an aborted scan			  --resume <filename>: Resume an aborted scan
  --stylesheet <path/URL>: XSL stylesheet to transform XML ou	  --stylesheet <path/URL>: XSL stylesheet to transform XML ou
  --webxml: Reference stylesheet from Nmap.Org for more porta	  --webxml: Reference stylesheet from Nmap.Org for more porta
  --no-stylesheet: Prevent associating of XSL stylesheet w/XM	  --no-stylesheet: Prevent associating of XSL stylesheet w/XM
MISC:								MISC:
  -6: Enable IPv6 scanning					  -6: Enable IPv6 scanning
  -A: Enable OS detection, version detection, script scanning	  -A: Enable OS detection, version detection, script scanning
  --datadir <dirname>: Specify custom Nmap data file location	  --datadir <dirname>: Specify custom Nmap data file location
  --send-eth/--send-ip: Send using raw ethernet frames or IP 	  --send-eth/--send-ip: Send using raw ethernet frames or IP 
  --privileged: Assume that the user is fully privileged	  --privileged: Assume that the user is fully privileged
  --unprivileged: Assume the user lacks raw socket privileges	  --unprivileged: Assume the user lacks raw socket privileges
  -V: Print version number					  -V: Print version number
  -h: Print this help summary page.				  -h: Print this help summary page.
EXAMPLES:							EXAMPLES:
  nmap -v -A scanme.nmap.org					  nmap -v -A scanme.nmap.org
  nmap -v -sn 192.168.0.0/16 10.0.0.0/8				  nmap -v -sn 192.168.0.0/16 10.0.0.0/8
  nmap -v -iR 10000 -Pn -p 80					  nmap -v -iR 10000 -Pn -p 80
SEE THE MAN PAGE (http://nmap.org/book/man.html) FOR MORE OPT |	SEE THE MAN PAGE (https://nmap.org/book/man.html) FOR MORE OP

```
