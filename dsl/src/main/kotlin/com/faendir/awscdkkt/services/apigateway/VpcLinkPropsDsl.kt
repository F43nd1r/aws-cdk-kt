package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.VpcLinkProps

@Generated
public fun vpcLinkProps(initializer: VpcLinkProps.Builder.() -> Unit = {}): VpcLinkProps =
    VpcLinkProps.builder().apply(initializer).build()
