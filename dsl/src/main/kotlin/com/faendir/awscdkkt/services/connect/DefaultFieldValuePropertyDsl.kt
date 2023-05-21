package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnTaskTemplate

@Generated
public
    fun defaultFieldValueProperty(initializer: CfnTaskTemplate.DefaultFieldValueProperty.Builder.() -> Unit
    = {}): CfnTaskTemplate.DefaultFieldValueProperty =
    CfnTaskTemplate.DefaultFieldValueProperty.builder().apply(initializer).build()
