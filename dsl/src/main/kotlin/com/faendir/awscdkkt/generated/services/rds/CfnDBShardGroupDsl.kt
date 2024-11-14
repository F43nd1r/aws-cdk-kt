package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBShardGroup
import software.amazon.awscdk.services.rds.CfnDBShardGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBShardGroup(
  id: String,
  props: CfnDBShardGroupProps,
  initializer: @AwsCdkDsl CfnDBShardGroup.() -> Unit = {},
): CfnDBShardGroup = CfnDBShardGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBShardGroup(id: String, initializer: @AwsCdkDsl
    CfnDBShardGroup.Builder.() -> Unit = {}): CfnDBShardGroup = CfnDBShardGroup.Builder.create(this,
    id).apply(initializer).build()
