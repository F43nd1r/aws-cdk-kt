package com.faendir.awscdkkt.generated.services.devicefarm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCEConfiguration(
  id: String,
  props: CfnVPCEConfigurationProps,
  initializer: @AwsCdkDsl CfnVPCEConfiguration.() -> Unit = {},
): CfnVPCEConfiguration = CfnVPCEConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCEConfiguration(id: String, initializer: @AwsCdkDsl
    CfnVPCEConfiguration.Builder.() -> Unit = {}): CfnVPCEConfiguration =
    CfnVPCEConfiguration.Builder.create(this, id).apply(initializer).build()
