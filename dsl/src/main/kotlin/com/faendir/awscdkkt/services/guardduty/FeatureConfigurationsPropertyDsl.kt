package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetector

@Generated
public
    fun featureConfigurationsProperty(initializer: CfnDetector.FeatureConfigurationsProperty.Builder.() -> Unit
    = {}): CfnDetector.FeatureConfigurationsProperty =
    CfnDetector.FeatureConfigurationsProperty.builder().apply(initializer).build()
