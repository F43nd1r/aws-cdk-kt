package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@Generated
public fun dataResourceProperty(initializer: CfnTrail.DataResourceProperty.Builder.() -> Unit = {}):
    CfnTrail.DataResourceProperty =
    CfnTrail.DataResourceProperty.builder().apply(initializer).build()
