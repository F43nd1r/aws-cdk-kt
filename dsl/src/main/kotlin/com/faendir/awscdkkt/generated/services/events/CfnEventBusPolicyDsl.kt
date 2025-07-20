package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.CfnEventBusPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventBusPolicy(
  id: String,
  props: CfnEventBusPolicyProps,
  initializer: @AwsCdkDsl CfnEventBusPolicy.() -> Unit = {},
): CfnEventBusPolicy = CfnEventBusPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventBusPolicy(id: String, initializer: @AwsCdkDsl CfnEventBusPolicy.Builder.() -> Unit = {}): CfnEventBusPolicy = CfnEventBusPolicy.Builder.create(this, id).apply(initializer).build()
