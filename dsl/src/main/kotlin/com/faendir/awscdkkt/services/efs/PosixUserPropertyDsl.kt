package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnAccessPoint

@Generated
public fun posixUserProperty(initializer: CfnAccessPoint.PosixUserProperty.Builder.() -> Unit = {}):
    CfnAccessPoint.PosixUserProperty =
    CfnAccessPoint.PosixUserProperty.builder().apply(initializer).build()
