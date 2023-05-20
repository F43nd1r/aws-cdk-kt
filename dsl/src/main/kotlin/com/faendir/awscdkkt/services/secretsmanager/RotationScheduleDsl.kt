@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import software.constructs.Construct

public fun Construct.rotationSchedule(
  id: String,
  props: RotationScheduleProps,
  initializer: RotationSchedule.() -> Unit = {},
): RotationSchedule = RotationSchedule(this, id, props).apply(initializer)
