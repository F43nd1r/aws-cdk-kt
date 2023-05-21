package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

@Generated
public
    fun instanceTypeConfigProperty(initializer: CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.() -> Unit
    = {}): CfnInstanceFleetConfig.InstanceTypeConfigProperty =
    CfnInstanceFleetConfig.InstanceTypeConfigProperty.builder().apply(initializer).build()
