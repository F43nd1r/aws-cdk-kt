package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnRoutingProfile
import software.amazon.awscdk.services.connect.CfnRoutingProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRoutingProfile(
  id: String,
  props: CfnRoutingProfileProps,
  initializer: @AwsCdkDsl CfnRoutingProfile.() -> Unit = {},
): CfnRoutingProfile = CfnRoutingProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRoutingProfile(id: String, initializer: @AwsCdkDsl
    CfnRoutingProfile.Builder.() -> Unit = {}): CfnRoutingProfile =
    CfnRoutingProfile.Builder.create(this, id).apply(initializer).build()
