package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps
import software.constructs.Construct

@Generated
public fun Construct.emrModifyInstanceGroupByName(id: String,
    props: EmrModifyInstanceGroupByNameProps): EmrModifyInstanceGroupByName =
    EmrModifyInstanceGroupByName(this, id, props)

@Generated
public fun Construct.emrModifyInstanceGroupByName(
  id: String,
  props: EmrModifyInstanceGroupByNameProps,
  initializer: @AwsCdkDsl EmrModifyInstanceGroupByName.() -> Unit,
): EmrModifyInstanceGroupByName = EmrModifyInstanceGroupByName(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmrModifyInstanceGroupByName(id: String, initializer: @AwsCdkDsl
    EmrModifyInstanceGroupByName.Builder.() -> Unit): EmrModifyInstanceGroupByName =
    EmrModifyInstanceGroupByName.Builder.create(this, id).apply(initializer).build()
