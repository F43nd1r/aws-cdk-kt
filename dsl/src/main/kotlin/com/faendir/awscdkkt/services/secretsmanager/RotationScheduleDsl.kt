@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
