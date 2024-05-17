import "./Idea.css"

const Idea = () => {
    return(
        <div className="Idea">
            <div className="container">
                <div className='input-container'>
                    <label>Title:</label>
                    <input type='text' placeholder='Swap values of two variables without using third variable'/>
                </div>
                <div className='input-container'>
                    <label>Tags:</label>
                    <input type='text' placeholder='Algorithms'/>
                </div>
                <div className='input-container'>
                    <label>Description:</label>
                    <textarea rows={10}></textarea>
                </div>
                <div className="button-container">
                    <button>Save Idea</button>
                    <button>Back</button>
                </div>
            </div>
        </div>
    )
}
export default Idea;