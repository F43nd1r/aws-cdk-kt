package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.CodeBuildProjectProps

@Generated
public fun codeBuildProjectProps(initializer: CodeBuildProjectProps.Builder.() -> Unit = {}):
    CodeBuildProjectProps = CodeBuildProjectProps.builder().apply(initializer).build()
