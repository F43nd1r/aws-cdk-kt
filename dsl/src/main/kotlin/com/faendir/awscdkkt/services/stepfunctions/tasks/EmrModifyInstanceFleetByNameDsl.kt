package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByNameProps
import software.constructs.Construct

@Generated
public fun Construct.emrModifyInstanceFleetByName(
  id: String,
  props: EmrModifyInstanceFleetByNameProps,
  initializer: EmrModifyInstanceFleetByName.() -> Unit = {},
): EmrModifyInstanceFleetByName = EmrModifyInstanceFleetByName(this, id, props).apply(initializer)
