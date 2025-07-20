package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSMSChannel
import software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSMSChannel(
  id: String,
  props: CfnSMSChannelProps,
  initializer: @AwsCdkDsl CfnSMSChannel.() -> Unit = {},
): CfnSMSChannel = CfnSMSChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSMSChannel(id: String, initializer: @AwsCdkDsl CfnSMSChannel.Builder.() -> Unit = {}): CfnSMSChannel = CfnSMSChannel.Builder.create(this, id).apply(initializer).build()
