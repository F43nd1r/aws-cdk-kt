package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod

@Generated
public fun buildThrottlingPerMethod(initializer: @AwsCdkDsl ThrottlingPerMethod.Builder.() -> Unit):
    ThrottlingPerMethod = ThrottlingPerMethod.Builder().apply(initializer).build()
