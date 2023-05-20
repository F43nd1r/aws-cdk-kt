@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.FileCopyOptions

public fun fileCopyOptions(initializer: FileCopyOptions.Builder.() -> Unit): FileCopyOptions =
    FileCopyOptions.builder().apply(initializer).build()
