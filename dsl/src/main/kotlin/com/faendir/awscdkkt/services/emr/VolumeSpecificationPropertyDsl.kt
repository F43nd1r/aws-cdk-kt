package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun volumeSpecificationProperty(initializer: CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.VolumeSpecificationProperty =
    CfnInstanceGroupConfig.VolumeSpecificationProperty.builder().apply(initializer).build()
