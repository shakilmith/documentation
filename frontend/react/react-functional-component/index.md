# React Functional Components

Components are recognized as functions and they are reusable and stateful in React application. They helps to render html content to the DOM (document object model).

In ReactJS, We can create components or you can say JavaScript functions in two ways. Functional approach and ES6 class based approach. Let's compare between both through the following example.


```
//component that follow functional approach
function FunctionalComponent(){
  return <h1>I am functional component.</h1>
}

//component that follow ES6 class based approach
class ClassComponent extends React.Component{
  render(){
    return <h1>I am a class component.</h1>
  }
}
```

Both components do the same thing. But it is recommended to use functional component in your newly created react applications. Yes, the functional approach looks very pretty.

## Root Level Component

Building react application means, we create a lot of components to achieve a certain goal. But, every react component (.js or .ts extension) file, must contain a root level or parent component and may contain more than one child component. And that component must be exported. Look at the below example.


```
import React from 'react';

function ParentComponent() {
  return (
    <div>

      <FirstChild />
      <SecondChild />
      <ThirdChild />

    </div>
  );
}

function FirstChild(){
  return <h1>First Child Component</h1>
}

function SecondChild(){
  return <h1>Second Child Component</h1>
}

function ThirdChild(){
  return <h1> Third Child Component</h1>
}

export default ParentComponent;
```

Here in the above code, you can see, we have a parent component and three child components. And we then invoke the child components in the parent (top level) component. At the end, we have exported the parent component ***export default ParentComponent;***

## How to Export the Parent Component at The Time of Component Declaration

We can export a top level or parent component at the time of declaring the component. Such as,

```
//create and export a component
export default App(){ //it should be the root component of this file
  return <h1>Export a default Component</h1>
}
```

**Note:** A .js or .ts file must not contain more than one default or root level component. Thus, we can only use one export default syntax in a .js or .ts file.


