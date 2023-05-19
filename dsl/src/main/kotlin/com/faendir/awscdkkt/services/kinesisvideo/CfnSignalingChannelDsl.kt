@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisvideo

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
import software.constructs.Construct

public fun Construct.cfnSignalingChannel(id: String, initializer: CfnSignalingChannel.() -> Unit =
    {}): CfnSignalingChannel = CfnSignalingChannel(this, id).apply(initializer)

public fun Construct.cfnSignalingChannel(
  id: String,
  props: CfnSignalingChannelProps,
  initializer: CfnSignalingChannel.() -> Unit = {},
): CfnSignalingChannel = CfnSignalingChannel(this, id, props).apply(initializer)
