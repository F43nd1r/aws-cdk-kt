@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

public
    fun spotOptionsRequestProperty(initializer: CfnEC2Fleet.SpotOptionsRequestProperty.Builder.() -> Unit):
    CfnEC2Fleet.SpotOptionsRequestProperty =
    CfnEC2Fleet.SpotOptionsRequestProperty.builder().apply(initializer).build()
