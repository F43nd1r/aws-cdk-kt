package com.faendir.awscdkkt.generated.services.robomaker

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnSimulationApplication.() -> Unit = {},
): CfnSimulationApplication = CfnSimulationApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSimulationApplication(id: String, initializer: @AwsCdkDsl
    CfnSimulationApplication.Builder.() -> Unit = {}): CfnSimulationApplication =
    CfnSimulationApplication.Builder.create(this, id).apply(initializer).build()
