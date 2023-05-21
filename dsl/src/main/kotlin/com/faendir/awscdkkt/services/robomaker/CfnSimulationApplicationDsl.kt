package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSimulationApplication(
  id: String,
  props: CfnSimulationApplicationProps,
  initializer: CfnSimulationApplication.() -> Unit = {},
): CfnSimulationApplication = CfnSimulationApplication(this, id, props).apply(initializer)
