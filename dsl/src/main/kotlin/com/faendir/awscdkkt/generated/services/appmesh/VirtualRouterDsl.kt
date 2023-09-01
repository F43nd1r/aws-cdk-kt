package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterProps
import software.constructs.Construct

@Generated
public fun Construct.virtualRouter(
  id: String,
  props: VirtualRouterProps,
  initializer: @AwsCdkDsl VirtualRouter.() -> Unit = {},
): VirtualRouter = VirtualRouter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVirtualRouter(id: String, initializer: @AwsCdkDsl
    VirtualRouter.Builder.() -> Unit = {}): VirtualRouter = VirtualRouter.Builder.create(this,
    id).apply(initializer).build()
