package com.faendir.awscdkkt.generated.services.chime

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chime.CfnChannelFlow
import software.amazon.awscdk.services.chime.CfnChannelFlowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannelFlow(
  id: String,
  props: CfnChannelFlowProps,
  initializer: @AwsCdkDsl CfnChannelFlow.() -> Unit = {},
): CfnChannelFlow = CfnChannelFlow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChannelFlow(id: String, initializer: @AwsCdkDsl CfnChannelFlow.Builder.() -> Unit = {}): CfnChannelFlow = CfnChannelFlow.Builder.create(this, id).apply(initializer).build()
