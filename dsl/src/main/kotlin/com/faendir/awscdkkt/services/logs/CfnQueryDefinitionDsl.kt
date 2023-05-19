@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnQueryDefinition
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
import software.constructs.Construct

public fun Construct.cfnQueryDefinition(
  id: String,
  props: CfnQueryDefinitionProps,
  initializer: CfnQueryDefinition.() -> Unit = {},
): CfnQueryDefinition = CfnQueryDefinition(this, id, props).apply(initializer)
