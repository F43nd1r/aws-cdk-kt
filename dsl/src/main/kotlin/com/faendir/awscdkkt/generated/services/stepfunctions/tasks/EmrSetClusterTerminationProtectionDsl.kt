package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EmrSetClusterTerminationProtection.() -> Unit = {},
): EmrSetClusterTerminationProtection = EmrSetClusterTerminationProtection(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildEmrSetClusterTerminationProtection(id: String, initializer: @AwsCdkDsl
    EmrSetClusterTerminationProtection.Builder.() -> Unit = {}): EmrSetClusterTerminationProtection
    = EmrSetClusterTerminationProtection.Builder.create(this, id).apply(initializer).build()
