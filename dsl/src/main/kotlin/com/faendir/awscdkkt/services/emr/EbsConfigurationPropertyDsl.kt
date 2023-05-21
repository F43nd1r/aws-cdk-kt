package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun ebsConfigurationProperty(initializer: CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.EbsConfigurationProperty =
    CfnInstanceGroupConfig.EbsConfigurationProperty.builder().apply(initializer).build()
