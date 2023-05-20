@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnAccessPoint

public
    fun accessPointTagProperty(initializer: CfnAccessPoint.AccessPointTagProperty.Builder.() -> Unit):
    CfnAccessPoint.AccessPointTagProperty =
    CfnAccessPoint.AccessPointTagProperty.builder().apply(initializer).build()
