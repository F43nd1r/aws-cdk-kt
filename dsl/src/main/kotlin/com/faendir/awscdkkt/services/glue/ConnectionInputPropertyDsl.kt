@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnConnection

public
    fun connectionInputProperty(initializer: CfnConnection.ConnectionInputProperty.Builder.() -> Unit):
    CfnConnection.ConnectionInputProperty =
    CfnConnection.ConnectionInputProperty.builder().apply(initializer).build()
