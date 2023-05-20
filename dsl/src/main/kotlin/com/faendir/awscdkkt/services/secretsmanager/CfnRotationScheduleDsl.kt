@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
