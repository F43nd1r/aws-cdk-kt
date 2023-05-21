package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.SourceProps

@Generated
public fun sourceProps(initializer: SourceProps.Builder.() -> Unit = {}): SourceProps =
    SourceProps.builder().apply(initializer).build()
