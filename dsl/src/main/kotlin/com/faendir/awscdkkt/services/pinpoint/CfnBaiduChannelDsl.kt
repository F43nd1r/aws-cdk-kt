package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBaiduChannel(
  id: String,
  props: CfnBaiduChannelProps,
  initializer: CfnBaiduChannel.() -> Unit = {},
): CfnBaiduChannel = CfnBaiduChannel(this, id, props).apply(initializer)
