package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnConnection

@Generated
public
    fun connectionInputProperty(initializer: CfnConnection.ConnectionInputProperty.Builder.() -> Unit
    = {}): CfnConnection.ConnectionInputProperty =
    CfnConnection.ConnectionInputProperty.builder().apply(initializer).build()
