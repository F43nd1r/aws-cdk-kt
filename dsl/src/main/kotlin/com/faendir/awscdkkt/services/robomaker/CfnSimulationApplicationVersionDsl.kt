package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSimulationApplicationVersion(
  id: String,
  props: CfnSimulationApplicationVersionProps,
  initializer: CfnSimulationApplicationVersion.() -> Unit = {},
): CfnSimulationApplicationVersion = CfnSimulationApplicationVersion(this, id,
    props).apply(initializer)
