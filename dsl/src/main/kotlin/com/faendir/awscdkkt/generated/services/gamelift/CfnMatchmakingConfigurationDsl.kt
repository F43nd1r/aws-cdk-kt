package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnMatchmakingConfiguration.() -> Unit = {},
): CfnMatchmakingConfiguration = CfnMatchmakingConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMatchmakingConfiguration(id: String, initializer: @AwsCdkDsl
    CfnMatchmakingConfiguration.Builder.() -> Unit = {}): CfnMatchmakingConfiguration =
    CfnMatchmakingConfiguration.Builder.create(this, id).apply(initializer).build()
