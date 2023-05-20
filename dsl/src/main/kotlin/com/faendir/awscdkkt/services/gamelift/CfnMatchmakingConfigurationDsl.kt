@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps
import software.constructs.Construct

public fun Construct.cfnMatchmakingConfiguration(
  id: String,
  props: CfnMatchmakingConfigurationProps,
  initializer: CfnMatchmakingConfiguration.() -> Unit = {},
): CfnMatchmakingConfiguration = CfnMatchmakingConfiguration(this, id, props).apply(initializer)
