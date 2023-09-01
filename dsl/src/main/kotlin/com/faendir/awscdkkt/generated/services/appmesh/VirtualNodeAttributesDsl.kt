package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualNodeAttributes

@Generated
public fun buildVirtualNodeAttributes(initializer: @AwsCdkDsl
    VirtualNodeAttributes.Builder.() -> Unit = {}): VirtualNodeAttributes =
    VirtualNodeAttributes.Builder().apply(initializer).build()
