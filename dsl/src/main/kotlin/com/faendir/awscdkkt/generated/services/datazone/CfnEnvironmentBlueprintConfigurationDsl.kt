package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration
import software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnvironmentBlueprintConfiguration(
  id: String,
  props: CfnEnvironmentBlueprintConfigurationProps,
  initializer: @AwsCdkDsl CfnEnvironmentBlueprintConfiguration.() -> Unit = {},
): CfnEnvironmentBlueprintConfiguration = CfnEnvironmentBlueprintConfiguration(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnEnvironmentBlueprintConfiguration(id: String, initializer: @AwsCdkDsl
    CfnEnvironmentBlueprintConfiguration.Builder.() -> Unit = {}):
    CfnEnvironmentBlueprintConfiguration = CfnEnvironmentBlueprintConfiguration.Builder.create(this,
    id).apply(initializer).build()
