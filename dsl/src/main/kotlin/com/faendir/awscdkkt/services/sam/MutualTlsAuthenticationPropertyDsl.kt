package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public
    fun mutualTlsAuthenticationProperty(initializer: CfnHttpApi.MutualTlsAuthenticationProperty.Builder.() -> Unit
    = {}): CfnHttpApi.MutualTlsAuthenticationProperty =
    CfnHttpApi.MutualTlsAuthenticationProperty.builder().apply(initializer).build()
