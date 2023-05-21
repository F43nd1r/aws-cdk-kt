package com.faendir.awscdkkt.services.devicefarm

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
  initializer: CfnNetworkProfile.() -> Unit = {},
): CfnNetworkProfile = CfnNetworkProfile(this, id, props).apply(initializer)
