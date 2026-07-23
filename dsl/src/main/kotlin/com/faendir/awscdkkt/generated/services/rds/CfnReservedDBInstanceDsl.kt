package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnReservedDBInstance
import software.amazon.awscdk.services.rds.CfnReservedDBInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReservedDBInstance(id: String, initializer: @AwsCdkDsl CfnReservedDBInstance.() -> Unit = {}): CfnReservedDBInstance = CfnReservedDBInstance(this, id).apply(initializer)

@Generated
public fun Construct.cfnReservedDBInstance(
  id: String,
  props: CfnReservedDBInstanceProps,
  initializer: @AwsCdkDsl CfnReservedDBInstance.() -> Unit = {},
): CfnReservedDBInstance = CfnReservedDBInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReservedDBInstance(id: String, initializer: @AwsCdkDsl CfnReservedDBInstance.Builder.() -> Unit = {}): CfnReservedDBInstance = CfnReservedDBInstance.Builder.create(this, id).apply(initializer).build()
