package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetector

@Generated
public
    fun featureAdditionalConfigurationProperty(initializer: CfnDetector.FeatureAdditionalConfigurationProperty.Builder.() -> Unit
    = {}): CfnDetector.FeatureAdditionalConfigurationProperty =
    CfnDetector.FeatureAdditionalConfigurationProperty.builder().apply(initializer).build()
