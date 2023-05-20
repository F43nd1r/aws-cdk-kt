@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApplication

public
    fun applicationLocationProperty(initializer: CfnApplication.ApplicationLocationProperty.Builder.() -> Unit):
    CfnApplication.ApplicationLocationProperty =
    CfnApplication.ApplicationLocationProperty.builder().apply(initializer).build()
