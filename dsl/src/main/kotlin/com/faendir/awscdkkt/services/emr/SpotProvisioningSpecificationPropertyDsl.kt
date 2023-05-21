package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

@Generated
public
    fun spotProvisioningSpecificationProperty(initializer: CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.() -> Unit
    = {}): CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty =
    CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.builder().apply(initializer).build()
