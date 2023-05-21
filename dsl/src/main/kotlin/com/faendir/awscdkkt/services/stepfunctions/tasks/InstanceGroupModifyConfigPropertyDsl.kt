package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName

@Generated
public
    fun instanceGroupModifyConfigProperty(initializer: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder.() -> Unit
    = {}): EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty =
    EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.builder().apply(initializer).build()
