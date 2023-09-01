package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.rotationSchedule(
  id: String,
  props: RotationScheduleProps,
  initializer: @AwsCdkDsl RotationSchedule.() -> Unit = {},
): RotationSchedule = RotationSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRotationSchedule(id: String, initializer: @AwsCdkDsl
    RotationSchedule.Builder.() -> Unit = {}): RotationSchedule =
    RotationSchedule.Builder.create(this, id).apply(initializer).build()
