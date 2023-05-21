package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelBiasJobDefinition(
  id: String,
  props: CfnModelBiasJobDefinitionProps,
  initializer: CfnModelBiasJobDefinition.() -> Unit = {},
): CfnModelBiasJobDefinition = CfnModelBiasJobDefinition(this, id, props).apply(initializer)
