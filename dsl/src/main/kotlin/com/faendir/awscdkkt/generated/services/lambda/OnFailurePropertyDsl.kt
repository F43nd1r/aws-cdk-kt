package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public fun buildOnFailureProperty(initializer: @AwsCdkDsl
    CfnEventSourceMapping.OnFailureProperty.Builder.() -> Unit):
    CfnEventSourceMapping.OnFailureProperty =
    CfnEventSourceMapping.OnFailureProperty.Builder().apply(initializer).build()
