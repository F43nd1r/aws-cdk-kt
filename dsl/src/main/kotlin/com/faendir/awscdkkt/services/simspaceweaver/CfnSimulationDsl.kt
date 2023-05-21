package com.faendir.awscdkkt.services.simspaceweaver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSimulation(id: String, initializer: CfnSimulation.() -> Unit = {}):
    CfnSimulation = CfnSimulation(this, id).apply(initializer)

@Generated
public fun Construct.cfnSimulation(
  id: String,
  props: CfnSimulationProps,
  initializer: CfnSimulation.() -> Unit = {},
): CfnSimulation = CfnSimulation(this, id, props).apply(initializer)
