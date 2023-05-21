package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.FileAsset

@Generated
public fun fileAsset(initializer: FileAsset.Builder.() -> Unit = {}): FileAsset =
    FileAsset.builder().apply(initializer).build()
