package com.faendir.awscdkkt.generated.services.robomaker

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnSimulationApplicationVersion.() -> Unit = {},
): CfnSimulationApplicationVersion = CfnSimulationApplicationVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSimulationApplicationVersion(id: String, initializer: @AwsCdkDsl CfnSimulationApplicationVersion.Builder.() -> Unit = {}): CfnSimulationApplicationVersion = CfnSimulationApplicationVersion.Builder.create(this, id).apply(initializer).build()
