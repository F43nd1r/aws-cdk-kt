package com.faendir.awscdkkt.services.iotcoredeviceadvisor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSuiteDefinition(
  id: String,
  props: CfnSuiteDefinitionProps,
  initializer: CfnSuiteDefinition.() -> Unit = {},
): CfnSuiteDefinition = CfnSuiteDefinition(this, id, props).apply(initializer)
