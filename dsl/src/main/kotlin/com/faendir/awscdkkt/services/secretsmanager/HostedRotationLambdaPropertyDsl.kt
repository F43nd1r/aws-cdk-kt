package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

@Generated
public
    fun hostedRotationLambdaProperty(initializer: CfnRotationSchedule.HostedRotationLambdaProperty.Builder.() -> Unit
    = {}): CfnRotationSchedule.HostedRotationLambdaProperty =
    CfnRotationSchedule.HostedRotationLambdaProperty.builder().apply(initializer).build()
