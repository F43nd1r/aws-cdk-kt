package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnDetector

@Generated
public
    fun cFNScanEc2InstanceWithFindingsConfigurationProperty(initializer: CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder.() -> Unit
    = {}): CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty =
    CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.builder().apply(initializer).build()
