package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public
    fun offPeakWindowOptionsProperty(initializer: CfnDomain.OffPeakWindowOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.OffPeakWindowOptionsProperty =
    CfnDomain.OffPeakWindowOptionsProperty.builder().apply(initializer).build()
