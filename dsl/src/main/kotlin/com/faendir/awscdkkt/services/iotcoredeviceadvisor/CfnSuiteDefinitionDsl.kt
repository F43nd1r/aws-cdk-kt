@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotcoredeviceadvisor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
import software.constructs.Construct

public fun Construct.cfnSuiteDefinition(
  id: String,
  props: CfnSuiteDefinitionProps,
  initializer: CfnSuiteDefinition.() -> Unit = {},
): CfnSuiteDefinition = CfnSuiteDefinition(this, id, props).apply(initializer)
