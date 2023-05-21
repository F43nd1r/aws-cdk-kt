package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnFilter

@Generated
public fun conditionProperty(initializer: CfnFilter.ConditionProperty.Builder.() -> Unit = {}):
    CfnFilter.ConditionProperty = CfnFilter.ConditionProperty.builder().apply(initializer).build()
