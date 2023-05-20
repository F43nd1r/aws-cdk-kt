@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps
import software.constructs.Construct

public fun Construct.emrModifyInstanceGroupByName(
  id: String,
  props: EmrModifyInstanceGroupByNameProps,
  initializer: EmrModifyInstanceGroupByName.() -> Unit = {},
): EmrModifyInstanceGroupByName = EmrModifyInstanceGroupByName(this, id, props).apply(initializer)
