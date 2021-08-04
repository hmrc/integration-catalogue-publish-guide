# Integration Catalogue Publish Guide

## Overview

This is based on the Service Guides created using GDS [Tech Docs Templates](https://github.com/alphagov/tech-docs-template).


The generated HTML files are then served by a simple Scala Play application so that they can be deployed
as an MDTP microservice.

Examples of Service Guides can be seen in [API Documentation in Developer Hub](https://developer.service.hmrc.gov.uk/api-documentation/docs/api).

## Getting started

Read [Tech Docs Templates][tdt] and [Documentation on using Tech Docs Templates](https://tdt-documentation.london.cloudapps.digital/#technical-documentation-template).

## Editing Service Guide pages

Template files are located in `./source/documentation`. All pages are written in [Markdown](https://en.wikipedia.org/wiki/Markdown).

To add new pages simply copy and paste one of the existing pages, it will automatically appear in the menu.

`example-page.html.md.erb` provides examples and best practices styles.

### Previewing the Service Guide

#### Option 1 - Docker

Requirements:
* [Docker](https://www.docker.com/)
* [Docker Compose](https://docs.docker.com/compose/)

To live preview:
```
docker-compose up
```
The local URL and port where the files can be previewed will be output, this is normally http://localhost:4567.

#### Option 2 - Local install

Requirements:
* Ruby 2.6 with Rubygems, preferably with a [Ruby version manager][rvm]
* [Bundler][bundler]
* [Node.js][nodejs]

To live preview:
```
bundle install
bundle exec middleman server
```
The local URL and port where the files can be previewed will be output, this is normally http://localhost:4567.

## Running the Scala Application

Requirements:
* Ruby 2.6 with Rubygems, preferably with a [Ruby version manager][rvm]
* [Bundler][bundler]
* [Node.js][nodejs]
* Scala/sbt

### Build the HTML files
  ```
  sbt test
  ```
### Run the Scala Application
  ```
  sbt run
  ```

The local URL and port where the files can be previewed will be output, this is normally http://localhost:9000.


[rvm]: https://www.ruby-lang.org/en/documentation/installation/#managers
[bundler]: http://bundler.io/
[tdt]: https://github.com/alphagov/tech-docs-template
[nodejs]: https://nodejs.org/

## License
This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
