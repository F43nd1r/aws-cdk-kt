package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUser

@Generated
public
    fun attributeTypeProperty(initializer: CfnUserPoolUser.AttributeTypeProperty.Builder.() -> Unit
    = {}): CfnUserPoolUser.AttributeTypeProperty =
    CfnUserPoolUser.AttributeTypeProperty.builder().apply(initializer).build()
