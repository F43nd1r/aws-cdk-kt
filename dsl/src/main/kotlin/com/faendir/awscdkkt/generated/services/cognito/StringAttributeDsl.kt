package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.StringAttribute

@Generated
public fun buildStringAttribute(initializer: @AwsCdkDsl StringAttribute.Builder.() -> Unit):
    StringAttribute = StringAttribute.Builder.create().apply(initializer).build()
