@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

public fun endpointProperty(initializer: CfnDBInstance.EndpointProperty.Builder.() -> Unit):
    CfnDBInstance.EndpointProperty =
    CfnDBInstance.EndpointProperty.builder().apply(initializer).build()
