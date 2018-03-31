import React from 'react'
import {Field, reduxForm} from 'redux-form'

const checkForm = form => {
    console.log(form.login)
    console.log(form.password)
}

const LoginBox = (props) => {
    return (<div>
        <form onSubmit={props.handleSubmit(checkForm)}>
            <div>
                <label >Login</label>
                <Field name="login" component="input" type="text" />
            </div>
            <div>
                <label>Password</label>
                <Field name="password" component="input" type="password" />
            </div>
            <button type="submit">login</button>
            <button type="button" onClick={props.reset}>clear</button>
        </form>
    </div>)
}

export default reduxForm({form: 'auth'})(LoginBox)
