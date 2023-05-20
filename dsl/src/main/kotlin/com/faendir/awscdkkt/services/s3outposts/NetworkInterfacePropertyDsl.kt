@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

public
    fun networkInterfaceProperty(initializer: CfnEndpoint.NetworkInterfaceProperty.Builder.() -> Unit):
    CfnEndpoint.NetworkInterfaceProperty =
    CfnEndpoint.NetworkInterfaceProperty.builder().apply(initializer).build()
