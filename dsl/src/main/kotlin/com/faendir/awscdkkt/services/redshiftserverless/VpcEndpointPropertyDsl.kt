package com.faendir.awscdkkt.services.redshiftserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

@Generated
public fun vpcEndpointProperty(initializer: CfnWorkgroup.VpcEndpointProperty.Builder.() -> Unit =
    {}): CfnWorkgroup.VpcEndpointProperty =
    CfnWorkgroup.VpcEndpointProperty.builder().apply(initializer).build()
