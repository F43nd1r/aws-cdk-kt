package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.MeshProps

@Generated
public fun meshProps(initializer: MeshProps.Builder.() -> Unit = {}): MeshProps =
    MeshProps.builder().apply(initializer).build()
