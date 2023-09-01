package com.faendir.awscdkkt.generated.services.devicefarm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfile
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkProfile(
  id: String,
  props: CfnNetworkProfileProps,
  initializer: @AwsCdkDsl CfnNetworkProfile.() -> Unit = {},
): CfnNetworkProfile = CfnNetworkProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkProfile(id: String, initializer: @AwsCdkDsl
    CfnNetworkProfile.Builder.() -> Unit = {}): CfnNetworkProfile =
    CfnNetworkProfile.Builder.create(this, id).apply(initializer).build()
