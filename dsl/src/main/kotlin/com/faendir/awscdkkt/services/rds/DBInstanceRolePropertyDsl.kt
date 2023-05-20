@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

public
    fun dBInstanceRoleProperty(initializer: CfnDBInstance.DBInstanceRoleProperty.Builder.() -> Unit):
    CfnDBInstance.DBInstanceRoleProperty =
    CfnDBInstance.DBInstanceRoleProperty.builder().apply(initializer).build()
