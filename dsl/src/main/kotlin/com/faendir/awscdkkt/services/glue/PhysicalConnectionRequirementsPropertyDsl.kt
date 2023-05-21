package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnConnection

@Generated
public
    fun physicalConnectionRequirementsProperty(initializer: CfnConnection.PhysicalConnectionRequirementsProperty.Builder.() -> Unit
    = {}): CfnConnection.PhysicalConnectionRequirementsProperty =
    CfnConnection.PhysicalConnectionRequirementsProperty.builder().apply(initializer).build()
