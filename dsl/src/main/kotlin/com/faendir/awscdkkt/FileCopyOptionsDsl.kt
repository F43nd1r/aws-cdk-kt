package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.FileCopyOptions

@Generated
public fun fileCopyOptions(initializer: FileCopyOptions.Builder.() -> Unit = {}): FileCopyOptions =
    FileCopyOptions.builder().apply(initializer).build()
