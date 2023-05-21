package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetector

@Generated
public
    fun cFNDataSourceConfigurationsProperty(initializer: CfnDetector.CFNDataSourceConfigurationsProperty.Builder.() -> Unit
    = {}): CfnDetector.CFNDataSourceConfigurationsProperty =
    CfnDetector.CFNDataSourceConfigurationsProperty.builder().apply(initializer).build()
