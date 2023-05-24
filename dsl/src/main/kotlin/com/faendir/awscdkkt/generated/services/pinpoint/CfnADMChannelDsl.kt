package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.amazon.awscdk.services.pinpoint.CfnADMChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnADMChannel(id: String, props: CfnADMChannelProps): CfnADMChannel =
    CfnADMChannel(this, id, props)

@Generated
public fun Construct.cfnADMChannel(
  id: String,
  props: CfnADMChannelProps,
  initializer: @AwsCdkDsl CfnADMChannel.() -> Unit,
): CfnADMChannel = CfnADMChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnADMChannel(id: String, initializer: @AwsCdkDsl
    CfnADMChannel.Builder.() -> Unit): CfnADMChannel = CfnADMChannel.Builder.create(this,
    id).apply(initializer).build()
