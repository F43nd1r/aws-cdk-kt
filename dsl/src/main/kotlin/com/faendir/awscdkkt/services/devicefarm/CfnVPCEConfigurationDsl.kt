@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.devicefarm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps
import software.constructs.Construct

public fun Construct.cfnVPCEConfiguration(
  id: String,
  props: CfnVPCEConfigurationProps,
  initializer: CfnVPCEConfiguration.() -> Unit = {},
): CfnVPCEConfiguration = CfnVPCEConfiguration(this, id, props).apply(initializer)
