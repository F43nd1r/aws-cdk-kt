@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps
import software.constructs.Construct

public fun Construct.cfnGameServerGroup(
  id: String,
  props: CfnGameServerGroupProps,
  initializer: CfnGameServerGroup.() -> Unit = {},
): CfnGameServerGroup = CfnGameServerGroup(this, id, props).apply(initializer)
