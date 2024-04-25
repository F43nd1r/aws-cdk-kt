package com.faendir.awscdkkt.generated.services.timestream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnInfluxDBInstance
import software.amazon.awscdk.services.timestream.CfnInfluxDBInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInfluxDBInstance(id: String, initializer: @AwsCdkDsl
    CfnInfluxDBInstance.() -> Unit = {}): CfnInfluxDBInstance = CfnInfluxDBInstance(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnInfluxDBInstance(
  id: String,
  props: CfnInfluxDBInstanceProps,
  initializer: @AwsCdkDsl CfnInfluxDBInstance.() -> Unit = {},
): CfnInfluxDBInstance = CfnInfluxDBInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInfluxDBInstance(id: String, initializer: @AwsCdkDsl
    CfnInfluxDBInstance.Builder.() -> Unit = {}): CfnInfluxDBInstance =
    CfnInfluxDBInstance.Builder.create(this, id).apply(initializer).build()
