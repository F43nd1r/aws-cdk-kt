package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions

@Generated
public fun ecsFargateLaunchTarget(): EcsFargateLaunchTarget = EcsFargateLaunchTarget()

@Generated
public fun ecsFargateLaunchTarget(options: EcsFargateLaunchTargetOptions): EcsFargateLaunchTarget =
    EcsFargateLaunchTarget(options)

@Generated
public fun buildEcsFargateLaunchTarget(initializer: @AwsCdkDsl
    EcsFargateLaunchTarget.Builder.() -> Unit): EcsFargateLaunchTarget =
    EcsFargateLaunchTarget.Builder.create().apply(initializer).build()
