package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataQualityJobDefinition(
  id: String,
  props: CfnDataQualityJobDefinitionProps,
  initializer: CfnDataQualityJobDefinition.() -> Unit = {},
): CfnDataQualityJobDefinition = CfnDataQualityJobDefinition(this, id, props).apply(initializer)
