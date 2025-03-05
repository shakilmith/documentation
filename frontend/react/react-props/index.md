# React Props

In react props (properties) help to share data within components. Like sharing data between child to parent or parent to child component in **Angular**. But in react, the syntax is little bit different. The term ***props*** used here is called properties and it does not need to be the name props.

Let's look over a simple example where we create a simple greeting component and pass greeting message through props.

**app.js**

```
import * as React from "react"

/*parent or root component*/
const App=()=>{

  return(
    <div>
      <Greeting />
    </div>
  )
}

/*child component that will be used inside parent*/
const Greeting=(props)=>{
  return(
    <div>
      <h1>Hello {props.name}</h1>
    </div>
  )
}

export default App;
```

![alt text](image1.png)


If you start your development server, you will see only the "Hello" message is rendered as we did not yet pass the props value. Here our props name is ***name*** and we have to register or pass its value when declaring the Greeting component inside the parent component, in this case ***App*** component.

So the modified ***app.js*** file should be,

**app.js**

```
<div>
  <Greeting name="Shakil"/>
</div>
```
Now the output will be "Hello Shakil"

![alt text](image2.png)


## Get More than One Greeting Message

What if, instead of one greeting, we want to render many greeting messages? Just, call the ***Greeting()*** component inside the parent component as much as possible with appropriate name property value. Such as,


**app.js** (Updated App component)

```
const App=()=>{

  return(
    <div>
      <Greeting name="Shakil" />
      <Greeting name="Jenkov" />
      <Greeting name="Mark" />
      <Greeting name="Selena" />
      <Greeting name="Rimi"/>
    </div>
  )
}
```

Instead of getting one greeting message now, we get five greeting messages.

![alt text](image3.png)

Though, the above example does not satisfy our goal. We basically want to share data between parent to child. So, instead of passing raw value in our Greeting component we can also pass data defined in the parent component. Such as,

**app.js**

```
const App=()=>{

  const myName ="Shakil";

  return(
    <div>
      <Greeting name={myName} />
    </div>
  )
}
```

![alt text](image2.png)

**Note:** We use ***{}*** brackets in order to display component data like variable, object, array etc. in React. Also note that, everything in between ***{}*** curly brackets are pure JavaScript. Thus, there is no need to specify script tag in react component. Though, in real life application developers usually depend on third party libraries like React Helmet or built in Script tag to add external scripts in the head section.

## Use More than One Props

Instead of one prop, we can pass as many props as our component required. Look at the following example, where we have passed three props.

**app.js**

```
const App=()=>{
  return(
    <div>

      <Person id="1" 
      name="Jekov Jenkov" 
      role="Java Developer" 
      />

    </div>
  )
}

const Person=(props)=>{
  return(
    <div>
      <p>Id: {props.id}</p>
      <p>Name: {props.name}</p>
      <p>Role: {props.role}</p>
    </div>
  )
}
export default App;
```

![alt text](image4.png)

What of the we have many persons than only one person? Yes, we can also handle this, by creating many Person objects, I mean calling the Person component many times. Though, it is not actual scenario, and in real application we basically create array of objects to handle this scenario.

**app.js**

```
<Person 
id="1"
name="Shakil Ahmed"
role="Java Developer" 
/>
<Person 
id="2"
name="Jekov Jenkov"
role="Rust Developer" 
/>
<Person 
id="3"
name="Robin Hood"
role="Python Developer" 
/>

<Person 
id="4"
name="Yesmin Khanom"
role="Cleaner" 
/>
```

![alt text](image5.png)

Just declare as many times as you want the Person component. Remember that every react component is valid JavaScript function, that provides extra features.

