package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FirelensLogRouter
import software.amazon.awscdk.services.ecs.FirelensLogRouterProps
import software.constructs.Construct

@Generated
public fun Construct.firelensLogRouter(
  id: String,
  props: FirelensLogRouterProps,
  initializer: @AwsCdkDsl FirelensLogRouter.() -> Unit = {},
): FirelensLogRouter = FirelensLogRouter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFirelensLogRouter(id: String, initializer: @AwsCdkDsl FirelensLogRouter.Builder.() -> Unit = {}): FirelensLogRouter = FirelensLogRouter.Builder.create(this, id).apply(initializer).build()
