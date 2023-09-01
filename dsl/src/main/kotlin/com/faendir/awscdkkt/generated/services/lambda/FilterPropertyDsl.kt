package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public fun buildFilterProperty(initializer: @AwsCdkDsl
    CfnEventSourceMapping.FilterProperty.Builder.() -> Unit = {}):
    CfnEventSourceMapping.FilterProperty =
    CfnEventSourceMapping.FilterProperty.Builder().apply(initializer).build()
