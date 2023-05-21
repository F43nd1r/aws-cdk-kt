package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtection
import software.amazon.awscdk.services.stepfunctions.tasks.EmrSetClusterTerminationProtectionProps
import software.constructs.Construct

@Generated
public fun Construct.emrSetClusterTerminationProtection(
  id: String,
  props: EmrSetClusterTerminationProtectionProps,
  initializer: EmrSetClusterTerminationProtection.() -> Unit = {},
): EmrSetClusterTerminationProtection = EmrSetClusterTerminationProtection(this, id,
    props).apply(initializer)
