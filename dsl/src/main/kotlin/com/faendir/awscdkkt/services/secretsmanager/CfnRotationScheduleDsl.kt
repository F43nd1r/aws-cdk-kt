@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
import software.constructs.Construct

public fun Construct.cfnRotationSchedule(
  id: String,
  props: CfnRotationScheduleProps,
  initializer: CfnRotationSchedule.() -> Unit = {},
): CfnRotationSchedule = CfnRotationSchedule(this, id, props).apply(initializer)
