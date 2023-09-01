package com.faendir.awscdkkt.generated.services.simspaceweaver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSimulation(
  id: String,
  props: CfnSimulationProps,
  initializer: @AwsCdkDsl CfnSimulation.() -> Unit = {},
): CfnSimulation = CfnSimulation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSimulation(id: String, initializer: @AwsCdkDsl
    CfnSimulation.Builder.() -> Unit = {}): CfnSimulation = CfnSimulation.Builder.create(this,
    id).apply(initializer).build()
