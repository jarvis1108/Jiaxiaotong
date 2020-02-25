			自述说明


1.数据库脚本

	由于采用PowerDesigner15的版本，因此MySQL的版本为5.0的版本，在生成的脚本中需去掉：数据库驱动行（可采用查找替换为空）：


	如下表：去掉：type = InnoDB charset = UTF8

                drop table if exists t_COM_SpecialTraining;

		/*==============================================================*/
		/* Table: t_COM_SpecialTraining                                 */
		/*==============================================================*/
		create table t_COM_SpecialTraining
		(
		   SpecialTrainingID    varchar(36) character set utf8 not null comment '编号',
		   SpecialTrainingName  varchar(255) character set utf8 comment '特训营名称',
		   UserID               varchar(36) character set utf8 comment '用户id',
		   UserNo               varchar(36) character set utf8 comment '用户编号',
		   LastUserID           varchar(36) character set utf8 comment '上家id',
		   CommunityRoleID      varchar(36) character set utf8 comment '社区角色编号',
		   TreeNodeCode         varchar(64) comment '树结点编号',
		   IsLeafNode           tinyint(4) comment '是否是叶子结点，1表示是；0表示不是',
		   CreateTime           datetime comment '创建时间',
		   CreateUser           varchar(36) comment '创建用户id',
		   LastUpdTime          timestamp default CURRENT_TIMESTAMP comment '最近修改时间',
		   LastUpdUser          varchar(36) comment '最近修改用户id',
		   IsValid              tinyint(4) default NULL comment '是否有效，1表示有效，0表示无效',
		   Remark               varchar(255) character set utf8 comment '备注信息',
		   primary key (SpecialTrainingID)
		)
		type = InnoDB charset = UTF8;
		
		alter table t_COM_SpecialTraining comment '特训营表';

        改后为：
		drop table if exists t_COM_SpecialTraining;

		/*==============================================================*/
		/* Table: t_COM_SpecialTraining                                 */
		/*==============================================================*/
		create table t_COM_SpecialTraining
		(
		   SpecialTrainingID    varchar(36) character set utf8 not null comment '编号',
		   SpecialTrainingName  varchar(255) character set utf8 comment '特训营名称',
		   UserID               varchar(36) character set utf8 comment '用户id',
		   UserNo               varchar(36) character set utf8 comment '用户编号',
		   LastUserID           varchar(36) character set utf8 comment '上家id',
		   CommunityRoleID      varchar(36) character set utf8 comment '社区角色编号',
		   TreeNodeCode         varchar(64) comment '树结点编号',
		   IsLeafNode           tinyint(4) comment '是否是叶子结点，1表示是；0表示不是',
		   CreateTime           datetime comment '创建时间',
		   CreateUser           varchar(36) comment '创建用户id',
		   LastUpdTime          timestamp default CURRENT_TIMESTAMP comment '最近修改时间',
		   LastUpdUser          varchar(36) comment '最近修改用户id',
		   IsValid              tinyint(4) default NULL comment '是否有效，1表示有效，0表示无效',
		   Remark               varchar(255) character set utf8 comment '备注信息',
		   primary key (SpecialTrainingID)
		);
		
		alter table t_COM_SpecialTraining comment '特训营表';