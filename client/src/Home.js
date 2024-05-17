import { useState } from 'react';
import AddIdea from './AddIdea';
import './Home.css'
import { useEffect } from 'react';
import axios from 'axios';

function Home() {
  const [ideas, setIdeas] = useState(null)
  const SERVER_URL = process.env.REACT_APP_SERVER_URL;
  
  const getIdeas = () => {
    axios.get(SERVER_URL).then((response) => {
      setIdeas(response?.data)
    })
  }
  useEffect(() => {
    if(ideas===null){
      getIdeas();
    }
  }, [ideas])
  return (
    <div className="Home">
      <div className='container'>
        <AddIdea getIdeas={getIdeas}/>
      </div>
      <div className='ideas-container'>
        {
          ideas!==null && ideas?.map((idea) => (
            <div className='idea' key={idea?.id}>
              <h3>{idea?.title}</h3>
              <p className='tag'>{`Tag: ${idea?.tag}`}</p>
              <p>{idea?.description}</p>
            </div>
          ))
        }
      </div>
    </div>
  );
}

export default Home;
