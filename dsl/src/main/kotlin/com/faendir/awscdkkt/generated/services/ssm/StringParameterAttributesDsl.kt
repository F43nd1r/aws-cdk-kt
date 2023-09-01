package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringParameterAttributes

@Generated
public fun buildStringParameterAttributes(initializer: @AwsCdkDsl
    StringParameterAttributes.Builder.() -> Unit = {}): StringParameterAttributes =
    StringParameterAttributes.Builder().apply(initializer).build()
