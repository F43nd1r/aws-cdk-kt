package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnUserGroup
import software.amazon.awscdk.services.elasticache.CfnUserGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserGroup(
  id: String,
  props: CfnUserGroupProps,
  initializer: @AwsCdkDsl CfnUserGroup.() -> Unit = {},
): CfnUserGroup = CfnUserGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserGroup(id: String, initializer: @AwsCdkDsl CfnUserGroup.Builder.() -> Unit = {}): CfnUserGroup = CfnUserGroup.Builder.create(this, id).apply(initializer).build()
