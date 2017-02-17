-- alter table
UPDATE `sec_group` SET `ID` = '0fa2b1a51d684d699fbddff348347f93' WHERE `sec_group`.`NAME` = 'Company';

INSERT IGNORE INTO `sec_group_hierarchy` (`ID`, `CREATE_TS`, `CREATED_BY`, `GROUP_ID`, `PARENT_ID`, `HIERARCHY_LEVEL`) VALUES ('ef61cedebc2ba501479e6cc995e7c8b4', NULL, NULL, '4a450d252827febe8ec153767638d048', '0fa2b1a51d684d699fbddff348347f93', '0');

INSERT IGNORE INTO `sec_group` (`ID`, `CREATE_TS`, `CREATED_BY`, `VERSION`, `UPDATE_TS`, `UPDATED_BY`, `DELETE_TS`, `DELETED_BY`, `DELETE_TS_NN`, `NAME`, `PARENT_ID`) VALUES
('4a450d252827febe8ec153767638d048', '2017-02-16 20:00:44.653', 'admin', 1, '2017-02-16 20:00:44.653', NULL, NULL, NULL, '1000-01-01 00:00:00.000', 'Arhitect', '0fa2b1a51d684d699fbddff348347f93');

INSERT IGNORE INTO `sec_constraint` (`ID`, `CREATE_TS`, `CREATED_BY`, `VERSION`, `UPDATE_TS`, `UPDATED_BY`, `DELETE_TS`, `DELETED_BY`, `CODE`, `CHECK_TYPE`, `OPERATION_TYPE`, `ENTITY_NAME`, `JOIN_CLAUSE`, `WHERE_CLAUSE`, `GROOVY_SCRIPT`, `FILTER_XML`, `IS_ACTIVE`, `GROUP_ID`) VALUES
('f302bcaae275d39e1299eeba007869f3', '2017-02-16 20:17:30.736', 'admin', 1, '2017-02-16 20:17:30.736', NULL, NULL, NULL, NULL, 'db', 'read', 'arhidoc$ProiectArhitectura', NULL, '{E}.createdBy = :session$userLogin', NULL, '<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n<filter>\n  <and>\n    <c name=\"createdBy\" class=\"java.lang.String\" operatorType=\"EQUAL\" width=\"1\" type=\"PROPERTY\"><![CDATA[queryEntity.createdBy = :component$filterWithoutId.createdBy80548]]>\n      <param name=\"component$filterWithoutId.createdBy80548\" javaClass=\"java.lang.String\">NULL</param>\n    </c>\n  </and>\n</filter>\n', 1, '4a450d252827febe8ec153767638d048');
