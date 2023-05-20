@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisvideo

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
import software.constructs.Construct

public fun Construct.cfnSignalingChannel(
  id: String,
  props: CfnSignalingChannelProps,
  initializer: CfnSignalingChannel.() -> Unit = {},
): CfnSignalingChannel = CfnSignalingChannel(this, id, props).apply(initializer)

public fun Construct.cfnSignalingChannel(id: String, initializer: CfnSignalingChannel.() -> Unit =
    {}): CfnSignalingChannel = CfnSignalingChannel(this, id).apply(initializer)
