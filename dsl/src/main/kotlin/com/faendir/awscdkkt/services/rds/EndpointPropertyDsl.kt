package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public fun endpointProperty(initializer: CfnDBInstance.EndpointProperty.Builder.() -> Unit = {}):
    CfnDBInstance.EndpointProperty =
    CfnDBInstance.EndpointProperty.builder().apply(initializer).build()
