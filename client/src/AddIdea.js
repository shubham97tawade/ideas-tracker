import { useState } from 'react';
import './AddIdea.css'
import axios from 'axios';

const AddIdea = ({getIdeas}) => {
    const [title, setTitle] = useState("");
    const [tag, setTag] = useState("");
    const [description, setDescription] = useState("");
    const SERVER_URL = process.env.REACT_APP_SERVER_URL;

    const addIdea = () => {
        if(title.trim()!=="" && tag.trim()!=="" && description!==""){
            const idea = {
                title: title,
                tag: tag,
                description: description,
                date: new Date().toISOString().slice(0, 10)
            }
            axios.post(SERVER_URL+"/saveIdea", idea, {headers: {
                'Content-Type': 'application/json'
            }}).then((response) => {
                console.log(response);
                setTitle('')
                setTag('')
                setDescription('')
                getIdeas()
            })
        }
        else{
            alert("Please fill all the fields!!")
        }
    }
    return(
        <div className="AddIdea">
            <div className='input-container'>
                <label>Title:</label>
                <input type='text' placeholder='Swap values of two variables without using third variable' value={title} onChange={(e) => setTitle(e.target.value)} />
            </div>
            <div className='input-container'>
                <label>Tags:</label>
                <input type='text' placeholder='Algorithms' value={tag} onChange={(e) => setTag(e.target.value)}/>
            </div>
            <div className='input-container'>
                <label>Description:</label>
                <textarea rows={6} value={description} onChange={(e) => setDescription(e.target.value)}></textarea>
            </div>
            <button onClick={addIdea}>Add Idea</button>
        </div>
    )
}
export default AddIdea;