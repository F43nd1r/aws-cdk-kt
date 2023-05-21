package com.faendir.awscdkkt.services.kinesisvideo

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSignalingChannel(id: String, initializer: CfnSignalingChannel.() -> Unit =
    {}): CfnSignalingChannel = CfnSignalingChannel(this, id).apply(initializer)

@Generated
public fun Construct.cfnSignalingChannel(
  id: String,
  props: CfnSignalingChannelProps,
  initializer: CfnSignalingChannel.() -> Unit = {},
): CfnSignalingChannel = CfnSignalingChannel(this, id, props).apply(initializer)
