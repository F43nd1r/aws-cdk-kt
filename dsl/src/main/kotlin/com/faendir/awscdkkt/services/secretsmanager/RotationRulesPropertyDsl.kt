@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

public
    fun rotationRulesProperty(initializer: CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit):
    CfnRotationSchedule.RotationRulesProperty =
    CfnRotationSchedule.RotationRulesProperty.builder().apply(initializer).build()
