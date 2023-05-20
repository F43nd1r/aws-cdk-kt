@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnChannel
import software.amazon.awscdk.services.mediapackage.CfnChannelProps
import software.constructs.Construct

public fun Construct.cfnChannel(
  id: String,
  props: CfnChannelProps,
  initializer: CfnChannel.() -> Unit = {},
): CfnChannel = CfnChannel(this, id, props).apply(initializer)
