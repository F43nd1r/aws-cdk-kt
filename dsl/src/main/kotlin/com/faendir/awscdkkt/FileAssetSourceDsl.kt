package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.FileAssetSource

@Generated
public fun fileAssetSource(initializer: FileAssetSource.Builder.() -> Unit = {}): FileAssetSource =
    FileAssetSource.builder().apply(initializer).build()
