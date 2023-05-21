package com.faendir.awscdkkt.services.refactorspaces

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnService

@Generated
public
    fun lambdaEndpointInputProperty(initializer: CfnService.LambdaEndpointInputProperty.Builder.() -> Unit
    = {}): CfnService.LambdaEndpointInputProperty =
    CfnService.LambdaEndpointInputProperty.builder().apply(initializer).build()
