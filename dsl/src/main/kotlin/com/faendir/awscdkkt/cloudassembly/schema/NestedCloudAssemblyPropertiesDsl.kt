package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties

@Generated
public
    fun nestedCloudAssemblyProperties(initializer: NestedCloudAssemblyProperties.Builder.() -> Unit
    = {}): NestedCloudAssemblyProperties =
    NestedCloudAssemblyProperties.builder().apply(initializer).build()
