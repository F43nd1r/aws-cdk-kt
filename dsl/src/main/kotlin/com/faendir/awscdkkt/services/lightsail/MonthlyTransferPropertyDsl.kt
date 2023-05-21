package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnInstance

@Generated
public
    fun monthlyTransferProperty(initializer: CfnInstance.MonthlyTransferProperty.Builder.() -> Unit
    = {}): CfnInstance.MonthlyTransferProperty =
    CfnInstance.MonthlyTransferProperty.builder().apply(initializer).build()
