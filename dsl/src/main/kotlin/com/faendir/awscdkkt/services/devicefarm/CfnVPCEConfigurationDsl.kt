@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
