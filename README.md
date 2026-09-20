# Service-Health-Monitor
A small Java project that models a fleet of infrastructure resources (web servers, databases, load balancers) and checks their health — the core shape of a real SRE monitoring tool.


Concepts
- Encapsulation — private fields, accessed through getters.
- Encapsulation — private fields, accessed through getters.
- Polymorphism — one ArrayList<Resource> holds all types; Database overrides isHealthy() with a stricter rule, and the health-check loop applies it automatically without checking types.
- Collections & loops — a fleet sweep that counts unhealthy resources and finds the hottest (highest CPU).
