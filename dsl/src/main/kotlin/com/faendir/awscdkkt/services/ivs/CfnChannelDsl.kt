package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnChannel
import software.amazon.awscdk.services.ivs.CfnChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannel(id: String, initializer: CfnChannel.() -> Unit = {}): CfnChannel =
    CfnChannel(this, id).apply(initializer)

@Generated
public fun Construct.cfnChannel(
  id: String,
  props: CfnChannelProps,
  initializer: CfnChannel.() -> Unit = {},
): CfnChannel = CfnChannel(this, id, props).apply(initializer)
