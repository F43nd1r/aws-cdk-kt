package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.FileSetLocation

@Generated
public fun fileSetLocation(initializer: FileSetLocation.Builder.() -> Unit = {}): FileSetLocation =
    FileSetLocation.builder().apply(initializer).build()
