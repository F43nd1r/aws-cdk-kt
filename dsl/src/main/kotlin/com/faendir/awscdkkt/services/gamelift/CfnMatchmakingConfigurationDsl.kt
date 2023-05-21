package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMatchmakingConfiguration(
  id: String,
  props: CfnMatchmakingConfigurationProps,
  initializer: CfnMatchmakingConfiguration.() -> Unit = {},
): CfnMatchmakingConfiguration = CfnMatchmakingConfiguration(this, id, props).apply(initializer)
