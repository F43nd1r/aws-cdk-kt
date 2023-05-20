@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
