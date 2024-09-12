import React, {useEffect, useState} from "react";
import axios from "axios";

function List(){
    let [list,setList] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/goods/list')
            .then(response =>{
                setList(response.list);
            })
            .catch(error =>{
                console.error('error :',error);
            })

    }, []);

    return (
        <>
            <h2>List</h2>
            <hr/>
            <table>
                <thead>
                    <tr>
                        <th>no</th>
                        <th>item</th>
                        <th>qty</th>
                        <th>price</th>
                    </tr>
                </thead>
                <tbody>
                    { list.map(goodsList => (
                        <tr key={goodsList.no}>
                            <td>{goodsList.no}</td>
                            <td>{goodsList.item}</td>
                            <td>{goodsList.qty}</td>
                            <td>{goodsList.price}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    )
}

export default List