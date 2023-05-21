package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnImageBuilder

@Generated
public fun vpcConfigProperty(initializer: CfnImageBuilder.VpcConfigProperty.Builder.() -> Unit =
    {}): CfnImageBuilder.VpcConfigProperty =
    CfnImageBuilder.VpcConfigProperty.builder().apply(initializer).build()
