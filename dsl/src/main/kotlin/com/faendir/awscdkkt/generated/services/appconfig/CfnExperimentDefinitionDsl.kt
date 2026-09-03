package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnExperimentDefinition
import software.amazon.awscdk.services.appconfig.CfnExperimentDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExperimentDefinition(
  id: String,
  props: CfnExperimentDefinitionProps,
  initializer: @AwsCdkDsl CfnExperimentDefinition.() -> Unit = {},
): CfnExperimentDefinition = CfnExperimentDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExperimentDefinition(id: String, initializer: @AwsCdkDsl CfnExperimentDefinition.Builder.() -> Unit = {}): CfnExperimentDefinition = CfnExperimentDefinition.Builder.create(this, id).apply(initializer).build()
