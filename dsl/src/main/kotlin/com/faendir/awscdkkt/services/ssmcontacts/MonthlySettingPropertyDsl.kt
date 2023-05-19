@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

public
    fun monthlySettingProperty(initializer: CfnRotation.MonthlySettingProperty.Builder.() -> Unit):
    CfnRotation.MonthlySettingProperty =
    CfnRotation.MonthlySettingProperty.builder().apply(initializer).build()
