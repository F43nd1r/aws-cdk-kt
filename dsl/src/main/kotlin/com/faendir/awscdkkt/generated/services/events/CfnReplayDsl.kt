package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnReplay
import software.amazon.awscdk.services.events.CfnReplayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplay(
  id: String,
  props: CfnReplayProps,
  initializer: @AwsCdkDsl CfnReplay.() -> Unit = {},
): CfnReplay = CfnReplay(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplay(id: String, initializer: @AwsCdkDsl CfnReplay.Builder.() -> Unit = {}): CfnReplay = CfnReplay.Builder.create(this, id).apply(initializer).build()
