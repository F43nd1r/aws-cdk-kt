package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer

@Generated
public
    fun resourceServerScopeTypeProperty(initializer: CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder.() -> Unit
    = {}): CfnUserPoolResourceServer.ResourceServerScopeTypeProperty =
    CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.builder().apply(initializer).build()
