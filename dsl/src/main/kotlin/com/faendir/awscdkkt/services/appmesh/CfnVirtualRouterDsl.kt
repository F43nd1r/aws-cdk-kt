package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVirtualRouter(
  id: String,
  props: CfnVirtualRouterProps,
  initializer: CfnVirtualRouter.() -> Unit = {},
): CfnVirtualRouter = CfnVirtualRouter(this, id, props).apply(initializer)
