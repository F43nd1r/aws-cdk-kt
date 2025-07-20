package com.faendir.awscdkkt.generated.services.route53profiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53profiles.CfnProfile
import software.amazon.awscdk.services.route53profiles.CfnProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProfile(
  id: String,
  props: CfnProfileProps,
  initializer: @AwsCdkDsl CfnProfile.() -> Unit = {},
): CfnProfile = CfnProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProfile(id: String, initializer: @AwsCdkDsl CfnProfile.Builder.() -> Unit = {}): CfnProfile = CfnProfile.Builder.create(this, id).apply(initializer).build()
