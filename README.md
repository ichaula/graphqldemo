# Spring Boot + GraphQL 


# 1. Clone Project, cd to root project directory and run these two Docker commands
```
docker image build -t graphql-springboot .
docker container run -p 8080:8080 graphql-springboot
```

# Alternative: You can run application from terminal if maven is installed:
```
mvn clean install
mvn spring-boot:run
```


# You can test following query from GraphQL Playground
```
http://localhost:8080/apis/graphql
```


#### Download GraphQL Playground to Test GraphQL Query

## USER QUERY

##### Get User by Id
```json
query{
  getUserById(id:1){
    id 
    name
    username
    email
    phone
    website
    address{
    	street 
    	suite 
    	city 
      zipcode
    }
  }
}
```

##### Get All Users
```json
query{
  getAllUser{
    id 
    name
    username
    email
    phone
    website
    address{
    	street 
    	suite 
    	city 
      zipcode
    }
  }
}
```

##### Delete User
```json
mutation{
  deleteUser(id:1)  
}
```



##### Update User
```json
mutation{
  updateUser(id: 1, username: "updatedUser")  
}
```


# POST QUERY

##### Get All Post
```json
query{
  getAllPost{
    id
    user{
      id
      name
      username
      email
      phone
      website
      address{
        street 
    		suite 
    		city 
      	zipcode
      }
    }
    title
    body
    comments{
      id
      post
      name
      email
      body
    }
  }
}
```

##### Get Post by Id
```json
query{
  getPostById(id:1){
    id
    user{
      id
      name
      username
      email
      phone
      website
      address{
        street 
    		suite 
    		city 
      	zipcode
      }
    }
    title
    body
    comments{
      id
      name
      email
      body
    }
  }
}
```


##### Update Post
```json
mutation{
  updatePost(id:1, title: "Updated Title"){
    id
    user{
      id
      name
      username
      email
      phone
      website
      address{
        street 
    		suite 
    		city 
      	zipcode
      }
    }
    title
    body
    comments{
      id
      name
      email
      body
    }
  }
}
```


##### Delete Post
```json
mutation{
  deletePost(id:1)
}
```


# COMMENT QUERY

##### Get All Comments
```json
query{
  getAllComment{
    id
    name
    email
    body
  }
}
```


##### Get Comment by Id
```json
query{
  getCommentById(id:1){
    id
    name
    email
    body
  }
}
```

##### Get Comments from Post
```json
query{
  getCommentFromPost(id: 1){
      id
      name
      email
      body   
  }
}
```

##### Update Comment
```json
mutation{
  updateComment(id: 1, email:"updated@email.com"){
  id
  email
  name
  body
  }
}
```


##### Delete Comment
```json
mutation{
  deleteComment(id: 1)    
}
```



