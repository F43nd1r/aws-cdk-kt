package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@Generated
public fun buildVirtualNodeServiceProviderProperty(initializer: @AwsCdkDsl
    CfnVirtualService.VirtualNodeServiceProviderProperty.Builder.() -> Unit = {}):
    CfnVirtualService.VirtualNodeServiceProviderProperty =
    CfnVirtualService.VirtualNodeServiceProviderProperty.Builder().apply(initializer).build()
