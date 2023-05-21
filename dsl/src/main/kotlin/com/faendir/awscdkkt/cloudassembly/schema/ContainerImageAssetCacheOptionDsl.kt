package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption

@Generated
public
    fun containerImageAssetCacheOption(initializer: ContainerImageAssetCacheOption.Builder.() -> Unit
    = {}): ContainerImageAssetCacheOption =
    ContainerImageAssetCacheOption.builder().apply(initializer).build()
