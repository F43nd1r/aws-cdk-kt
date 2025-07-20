package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnVirtualRouter.() -> Unit = {},
): CfnVirtualRouter = CfnVirtualRouter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVirtualRouter(id: String, initializer: @AwsCdkDsl CfnVirtualRouter.Builder.() -> Unit = {}): CfnVirtualRouter = CfnVirtualRouter.Builder.create(this, id).apply(initializer).build()
