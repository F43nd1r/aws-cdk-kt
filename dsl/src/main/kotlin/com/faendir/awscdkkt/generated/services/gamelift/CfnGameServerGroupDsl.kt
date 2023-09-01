package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGameServerGroup(
  id: String,
  props: CfnGameServerGroupProps,
  initializer: @AwsCdkDsl CfnGameServerGroup.() -> Unit = {},
): CfnGameServerGroup = CfnGameServerGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGameServerGroup(id: String, initializer: @AwsCdkDsl
    CfnGameServerGroup.Builder.() -> Unit = {}): CfnGameServerGroup =
    CfnGameServerGroup.Builder.create(this, id).apply(initializer).build()
