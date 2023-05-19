@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.FileCopyOptions

public fun fileCopyOptions(initializer: FileCopyOptions.Builder.() -> Unit): FileCopyOptions =
    FileCopyOptions.builder().apply(initializer).build()
