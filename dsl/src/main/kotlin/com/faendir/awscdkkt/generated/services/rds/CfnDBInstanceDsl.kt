package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBInstance(id: String): CfnDBInstance = CfnDBInstance(this, id)

@Generated
public fun Construct.cfnDBInstance(id: String, initializer: @AwsCdkDsl CfnDBInstance.() -> Unit):
    CfnDBInstance = CfnDBInstance(this, id).apply(initializer)

@Generated
public fun Construct.cfnDBInstance(id: String, props: CfnDBInstanceProps): CfnDBInstance =
    CfnDBInstance(this, id, props)

@Generated
public fun Construct.cfnDBInstance(
  id: String,
  props: CfnDBInstanceProps,
  initializer: @AwsCdkDsl CfnDBInstance.() -> Unit,
): CfnDBInstance = CfnDBInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBInstance(id: String, initializer: @AwsCdkDsl
    CfnDBInstance.Builder.() -> Unit): CfnDBInstance = CfnDBInstance.Builder.create(this,
    id).apply(initializer).build()
