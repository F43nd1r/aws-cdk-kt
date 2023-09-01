package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public fun buildDBInstanceRoleProperty(initializer: @AwsCdkDsl
    CfnDBInstance.DBInstanceRoleProperty.Builder.() -> Unit = {}):
    CfnDBInstance.DBInstanceRoleProperty =
    CfnDBInstance.DBInstanceRoleProperty.Builder().apply(initializer).build()
