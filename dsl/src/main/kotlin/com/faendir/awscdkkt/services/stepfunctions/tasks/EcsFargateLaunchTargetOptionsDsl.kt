package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions

@Generated
public
    fun ecsFargateLaunchTargetOptions(initializer: EcsFargateLaunchTargetOptions.Builder.() -> Unit
    = {}): EcsFargateLaunchTargetOptions =
    EcsFargateLaunchTargetOptions.builder().apply(initializer).build()
