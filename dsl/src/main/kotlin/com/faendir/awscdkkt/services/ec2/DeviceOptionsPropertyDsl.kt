package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider

@Generated
public
    fun deviceOptionsProperty(initializer: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder.() -> Unit
    = {}): CfnVerifiedAccessTrustProvider.DeviceOptionsProperty =
    CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.builder().apply(initializer).build()
