@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByNameProps
import software.constructs.Construct

public fun Construct.emrModifyInstanceFleetByName(
  id: String,
  props: EmrModifyInstanceFleetByNameProps,
  initializer: EmrModifyInstanceFleetByName.() -> Unit = {},
): EmrModifyInstanceFleetByName = EmrModifyInstanceFleetByName(this, id, props).apply(initializer)
