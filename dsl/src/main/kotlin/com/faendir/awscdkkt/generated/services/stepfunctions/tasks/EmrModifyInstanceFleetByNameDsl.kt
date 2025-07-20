package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EmrModifyInstanceFleetByName.() -> Unit = {},
): EmrModifyInstanceFleetByName = EmrModifyInstanceFleetByName(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmrModifyInstanceFleetByName(id: String, initializer: @AwsCdkDsl EmrModifyInstanceFleetByName.Builder.() -> Unit = {}): EmrModifyInstanceFleetByName = EmrModifyInstanceFleetByName.Builder.create(this, id).apply(initializer).build()
