@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

public fun endpointProperty(initializer: CfnDBInstance.EndpointProperty.Builder.() -> Unit):
    CfnDBInstance.EndpointProperty =
    CfnDBInstance.EndpointProperty.builder().apply(initializer).build()
