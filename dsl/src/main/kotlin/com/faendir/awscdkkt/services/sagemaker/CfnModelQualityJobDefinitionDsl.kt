@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
import software.constructs.Construct

public fun Construct.cfnModelQualityJobDefinition(
  id: String,
  props: CfnModelQualityJobDefinitionProps,
  initializer: CfnModelQualityJobDefinition.() -> Unit = {},
): CfnModelQualityJobDefinition = CfnModelQualityJobDefinition(this, id, props).apply(initializer)
