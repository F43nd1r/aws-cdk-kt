@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider

public
    fun deviceOptionsProperty(initializer: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder.() -> Unit):
    CfnVerifiedAccessTrustProvider.DeviceOptionsProperty =
    CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.builder().apply(initializer).build()