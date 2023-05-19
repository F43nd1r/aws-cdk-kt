@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

public
    fun rotationRulesProperty(initializer: CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit):
    CfnRotationSchedule.RotationRulesProperty =
    CfnRotationSchedule.RotationRulesProperty.builder().apply(initializer).build()
