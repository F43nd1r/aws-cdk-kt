@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions

public
    fun ecsFargateLaunchTargetOptions(initializer: EcsFargateLaunchTargetOptions.Builder.() -> Unit):
    EcsFargateLaunchTargetOptions =
    EcsFargateLaunchTargetOptions.builder().apply(initializer).build()
