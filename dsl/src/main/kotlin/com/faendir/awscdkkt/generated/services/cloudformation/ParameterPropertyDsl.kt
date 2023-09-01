package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public fun buildParameterProperty(initializer: @AwsCdkDsl
    CfnStackSet.ParameterProperty.Builder.() -> Unit = {}): CfnStackSet.ParameterProperty =
    CfnStackSet.ParameterProperty.Builder().apply(initializer).build()
