package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.BooleanAttribute

@Generated
public fun buildBooleanAttribute(initializer: @AwsCdkDsl BooleanAttribute.Builder.() -> Unit = {}):
    BooleanAttribute = BooleanAttribute.Builder.create().apply(initializer).build()
