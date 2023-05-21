package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnApiKeyProps

@Generated
public fun cfnApiKeyProps(initializer: CfnApiKeyProps.Builder.() -> Unit = {}): CfnApiKeyProps =
    CfnApiKeyProps.builder().apply(initializer).build()
