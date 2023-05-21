package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

@Generated
public fun monthlySettingProperty(initializer: CfnRotation.MonthlySettingProperty.Builder.() -> Unit
    = {}): CfnRotation.MonthlySettingProperty =
    CfnRotation.MonthlySettingProperty.builder().apply(initializer).build()
