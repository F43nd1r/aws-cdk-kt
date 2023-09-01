package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.StringAttributeConstraints

@Generated
public fun buildStringAttributeConstraints(initializer: @AwsCdkDsl
    StringAttributeConstraints.Builder.() -> Unit = {}): StringAttributeConstraints =
    StringAttributeConstraints.Builder().apply(initializer).build()
