@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName

public
    fun instanceResizePolicyProperty(initializer: EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder.() -> Unit):
    EmrModifyInstanceGroupByName.InstanceResizePolicyProperty =
    EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.builder().apply(initializer).build()
