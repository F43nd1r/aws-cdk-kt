@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
import software.constructs.Construct

public fun Construct.cfnSimulationApplication(
  id: String,
  props: CfnSimulationApplicationProps,
  initializer: CfnSimulationApplication.() -> Unit = {},
): CfnSimulationApplication = CfnSimulationApplication(this, id, props).apply(initializer)
