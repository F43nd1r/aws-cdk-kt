package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public fun offPeakWindowProperty(initializer: CfnDomain.OffPeakWindowProperty.Builder.() -> Unit =
    {}): CfnDomain.OffPeakWindowProperty =
    CfnDomain.OffPeakWindowProperty.builder().apply(initializer).build()
