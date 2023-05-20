@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps
import software.constructs.Construct

public fun Construct.cfnModelExplainabilityJobDefinition(
  id: String,
  props: CfnModelExplainabilityJobDefinitionProps,
  initializer: CfnModelExplainabilityJobDefinition.() -> Unit = {},
): CfnModelExplainabilityJobDefinition = CfnModelExplainabilityJobDefinition(this, id,
    props).apply(initializer)
