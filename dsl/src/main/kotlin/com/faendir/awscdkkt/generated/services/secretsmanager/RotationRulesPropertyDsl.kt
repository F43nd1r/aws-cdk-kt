package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

@Generated
public fun buildRotationRulesProperty(initializer: @AwsCdkDsl
    CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit = {}):
    CfnRotationSchedule.RotationRulesProperty =
    CfnRotationSchedule.RotationRulesProperty.Builder().apply(initializer).build()
