package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicy
import software.amazon.awscdk.services.ivs.CfnPlaybackRestrictionPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlaybackRestrictionPolicy(
  id: String,
  props: CfnPlaybackRestrictionPolicyProps,
  initializer: @AwsCdkDsl CfnPlaybackRestrictionPolicy.() -> Unit = {},
): CfnPlaybackRestrictionPolicy = CfnPlaybackRestrictionPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlaybackRestrictionPolicy(id: String, initializer: @AwsCdkDsl
    CfnPlaybackRestrictionPolicy.Builder.() -> Unit = {}): CfnPlaybackRestrictionPolicy =
    CfnPlaybackRestrictionPolicy.Builder.create(this, id).apply(initializer).build()
