package com.faendir.awscdkkt.generated.services.mediapackagev2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicy
import software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannelPolicy(
  id: String,
  props: CfnChannelPolicyProps,
  initializer: @AwsCdkDsl CfnChannelPolicy.() -> Unit = {},
): CfnChannelPolicy = CfnChannelPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChannelPolicy(id: String, initializer: @AwsCdkDsl
    CfnChannelPolicy.Builder.() -> Unit = {}): CfnChannelPolicy =
    CfnChannelPolicy.Builder.create(this, id).apply(initializer).build()
