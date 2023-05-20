@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApplication

public
    fun applicationLocationProperty(initializer: CfnApplication.ApplicationLocationProperty.Builder.() -> Unit):
    CfnApplication.ApplicationLocationProperty =
    CfnApplication.ApplicationLocationProperty.builder().apply(initializer).build()
