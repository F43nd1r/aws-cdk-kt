package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxy

@Generated
public fun authFormatProperty(initializer: CfnDBProxy.AuthFormatProperty.Builder.() -> Unit = {}):
    CfnDBProxy.AuthFormatProperty =
    CfnDBProxy.AuthFormatProperty.builder().apply(initializer).build()
