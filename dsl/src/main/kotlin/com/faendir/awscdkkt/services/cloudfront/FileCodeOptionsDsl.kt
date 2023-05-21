package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.FileCodeOptions

@Generated
public fun fileCodeOptions(initializer: FileCodeOptions.Builder.() -> Unit = {}): FileCodeOptions =
    FileCodeOptions.builder().apply(initializer).build()
