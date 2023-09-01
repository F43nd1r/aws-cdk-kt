package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnDeliveryChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeliveryChannel(
  id: String,
  props: CfnDeliveryChannelProps,
  initializer: @AwsCdkDsl CfnDeliveryChannel.() -> Unit = {},
): CfnDeliveryChannel = CfnDeliveryChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeliveryChannel(id: String, initializer: @AwsCdkDsl
    CfnDeliveryChannel.Builder.() -> Unit = {}): CfnDeliveryChannel =
    CfnDeliveryChannel.Builder.create(this, id).apply(initializer).build()
