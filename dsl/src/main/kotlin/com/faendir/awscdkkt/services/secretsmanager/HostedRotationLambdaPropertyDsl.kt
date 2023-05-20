@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

public
    fun hostedRotationLambdaProperty(initializer: CfnRotationSchedule.HostedRotationLambdaProperty.Builder.() -> Unit):
    CfnRotationSchedule.HostedRotationLambdaProperty =
    CfnRotationSchedule.HostedRotationLambdaProperty.builder().apply(initializer).build()
