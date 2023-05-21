package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelExplainabilityJobDefinition(
  id: String,
  props: CfnModelExplainabilityJobDefinitionProps,
  initializer: CfnModelExplainabilityJobDefinition.() -> Unit = {},
): CfnModelExplainabilityJobDefinition = CfnModelExplainabilityJobDefinition(this, id,
    props).apply(initializer)
