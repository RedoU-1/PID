/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  redou
 * Created: 3 déc. 2025
 */

ALTER TABLE `users` ADD UNIQUE(`login`);
ALTER TABLE `users` ADD UNIQUE(`email`);
