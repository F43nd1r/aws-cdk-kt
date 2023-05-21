package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnChannel
import software.amazon.awscdk.services.cloudtrail.CfnChannelProps
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
