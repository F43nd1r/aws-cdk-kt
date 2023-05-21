package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps

@Generated
public
    fun emrModifyInstanceGroupByNameProps(initializer: EmrModifyInstanceGroupByNameProps.Builder.() -> Unit
    = {}): EmrModifyInstanceGroupByNameProps =
    EmrModifyInstanceGroupByNameProps.builder().apply(initializer).build()
