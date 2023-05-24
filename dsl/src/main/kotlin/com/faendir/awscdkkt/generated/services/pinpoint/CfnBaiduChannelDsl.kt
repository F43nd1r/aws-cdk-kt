package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBaiduChannel(id: String, props: CfnBaiduChannelProps): CfnBaiduChannel =
    CfnBaiduChannel(this, id, props)

@Generated
public fun Construct.cfnBaiduChannel(
  id: String,
  props: CfnBaiduChannelProps,
  initializer: @AwsCdkDsl CfnBaiduChannel.() -> Unit,
): CfnBaiduChannel = CfnBaiduChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBaiduChannel(id: String, initializer: @AwsCdkDsl
    CfnBaiduChannel.Builder.() -> Unit): CfnBaiduChannel = CfnBaiduChannel.Builder.create(this,
    id).apply(initializer).build()
