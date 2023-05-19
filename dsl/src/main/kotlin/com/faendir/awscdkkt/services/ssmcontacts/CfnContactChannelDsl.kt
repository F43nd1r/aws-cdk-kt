@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannel
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps
import software.constructs.Construct

public fun Construct.cfnContactChannel(
  id: String,
  props: CfnContactChannelProps,
  initializer: CfnContactChannel.() -> Unit = {},
): CfnContactChannel = CfnContactChannel(this, id, props).apply(initializer)
