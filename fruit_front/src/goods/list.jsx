import React, {useEffect, useState} from "react";
import axios from "axios";

function List(){
    let [list,setList] = useState('테스트해봅시다');

    useEffect(() => {
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
                    <tr>
                        <td>{list}</td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </>
    )
}

export default List