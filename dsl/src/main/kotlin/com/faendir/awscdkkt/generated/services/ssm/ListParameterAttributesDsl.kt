package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.ListParameterAttributes

@Generated
public fun buildListParameterAttributes(initializer: @AwsCdkDsl
    ListParameterAttributes.Builder.() -> Unit = {}): ListParameterAttributes =
    ListParameterAttributes.Builder().apply(initializer).build()
