# Overview

An agent can be assigned to only one team and reports to one manager.
A manager can manage multiple teams, and any one team can be managed by at most 2 managers.
An agent can only be assigned to a team that is managed by the same manager he reports to.
Basic implementation

# Implement the following API endpoints:

GET /teams/ - Returns a list of teams in the database in JSON format
GET /team/{{id}}/ - Returns a detail view of the specified team in JSON format
GET /agents/ - Returns a list of all agents in the database in JSON format
GET /agent/{{id}}/ - Returns a detail view of the specified agent in JSON format. This should include team details.
POST /team/ - Creates a new team with the specified details - Expects a JSON body
POST /agent/ - Creates a new agent with the specified details - Expects a JSON body

# Advanced implementation

GET /agents/ - Implement pagination and query parameters on this request. The agents identity number should no longer be returned in this request.
POST /manager/ - Creates a new manager with the specified details - Expects a JSON body
PUT /team/{{id}}/agent - Assigns an agent to the specified team
create an api endpoint that will return a list of all empty teams (i.e teams with no agents or managers)
