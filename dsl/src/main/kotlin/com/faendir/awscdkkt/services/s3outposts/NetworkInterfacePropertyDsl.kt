@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

public
    fun networkInterfaceProperty(initializer: CfnEndpoint.NetworkInterfaceProperty.Builder.() -> Unit):
    CfnEndpoint.NetworkInterfaceProperty =
    CfnEndpoint.NetworkInterfaceProperty.builder().apply(initializer).build()
