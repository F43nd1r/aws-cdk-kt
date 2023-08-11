package com.faendir.awscdkkt.generated.services.dms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationConfig
import software.amazon.awscdk.services.dms.CfnReplicationConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationConfig(id: String): CfnReplicationConfig =
    CfnReplicationConfig(this, id)

@Generated
public fun Construct.cfnReplicationConfig(id: String, initializer: @AwsCdkDsl
    CfnReplicationConfig.() -> Unit): CfnReplicationConfig = CfnReplicationConfig(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnReplicationConfig(id: String, props: CfnReplicationConfigProps):
    CfnReplicationConfig = CfnReplicationConfig(this, id, props)

@Generated
public fun Construct.cfnReplicationConfig(
  id: String,
  props: CfnReplicationConfigProps,
  initializer: @AwsCdkDsl CfnReplicationConfig.() -> Unit,
): CfnReplicationConfig = CfnReplicationConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicationConfig(id: String, initializer: @AwsCdkDsl
    CfnReplicationConfig.Builder.() -> Unit): CfnReplicationConfig =
    CfnReplicationConfig.Builder.create(this, id).apply(initializer).build()
