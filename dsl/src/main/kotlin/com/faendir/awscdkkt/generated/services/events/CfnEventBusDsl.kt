package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventBus(id: String, props: CfnEventBusProps): CfnEventBus =
    CfnEventBus(this, id, props)

@Generated
public fun Construct.cfnEventBus(
  id: String,
  props: CfnEventBusProps,
  initializer: @AwsCdkDsl CfnEventBus.() -> Unit,
): CfnEventBus = CfnEventBus(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventBus(id: String, initializer: @AwsCdkDsl
    CfnEventBus.Builder.() -> Unit): CfnEventBus = CfnEventBus.Builder.create(this,
    id).apply(initializer).build()
