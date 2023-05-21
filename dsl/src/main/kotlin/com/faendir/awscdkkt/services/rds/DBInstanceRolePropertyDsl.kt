package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public
    fun dBInstanceRoleProperty(initializer: CfnDBInstance.DBInstanceRoleProperty.Builder.() -> Unit
    = {}): CfnDBInstance.DBInstanceRoleProperty =
    CfnDBInstance.DBInstanceRoleProperty.builder().apply(initializer).build()
