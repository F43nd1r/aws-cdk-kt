@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps
import software.constructs.Construct

public fun Construct.cfnJobDefinition(
  id: String,
  props: CfnJobDefinitionProps,
  initializer: CfnJobDefinition.() -> Unit = {},
): CfnJobDefinition = CfnJobDefinition(this, id, props).apply(initializer)
