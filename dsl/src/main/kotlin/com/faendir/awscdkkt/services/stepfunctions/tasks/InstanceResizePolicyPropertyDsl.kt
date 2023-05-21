package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName

@Generated
public
    fun instanceResizePolicyProperty(initializer: EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder.() -> Unit
    = {}): EmrModifyInstanceGroupByName.InstanceResizePolicyProperty =
    EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.builder().apply(initializer).build()
